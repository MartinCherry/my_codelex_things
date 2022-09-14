package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many classes you have?");
        int classCount = Integer.parseInt(input.nextLine());
//        String something = input.nextLine();
//        input.nextLine();

        Subject[] classes = new Subject[classCount];

        for (int i = 0; i < classCount; i++) {
            System.out.println("Enter " + (i + 1) + ". class name");
            String className = input.nextLine();

            System.out.println("Enter " + (i + 1) + ". teachers name");
            String teacherName = input.nextLine();
            classes[i] = new Subject();

            classes[i].setClassName(className);
            classes[i].setTeacherName(teacherName);
        }

        //Get max char counts of names

        int maxClassLength = 0;
        int maxTeacherLength = 0;

        String classColumnName = "Nodarbiba";
        String teacherColumnName = "Pasniedzejs";

        for (int c = 0; c < classCount; c++) {
            if (classes[c].getClassName().length() > maxClassLength) {
                maxClassLength = classes[c].getClassName().length();
            }
        }
        for (int t = 0; t < classCount; t++) {
            if (classes[t].getTeacherName().length() > maxTeacherLength) {
                maxTeacherLength = classes[t].getTeacherName().length();
            }
        }
        if (maxClassLength < classColumnName.length()) {
            maxClassLength = classColumnName.length();
        }
        if (maxTeacherLength < teacherColumnName.length()) {
            maxTeacherLength = teacherColumnName.length();
        }

        // Printout
//
        // Header
        System.out.println("+" + "-".repeat(5 + maxClassLength + 5 + maxTeacherLength + 3) + "+");
        System.out.println("| N |  " + " ".repeat(maxClassLength - classColumnName.length()) + classColumnName + "  |  " + " ".repeat(maxTeacherLength - teacherColumnName.length()) + teacherColumnName + "  |");
        System.out.println("+" + "-".repeat(5 + maxClassLength + 5 + maxTeacherLength + 3) + "+");

        //Body
        for (int n = 0; n < classCount; n++) {
            System.out.println("| " + (n + 1) + " |  " + " ".repeat(maxClassLength - classes[n].getClassName().length()) + classes[n].getClassName() + "  |  " + " ".repeat(maxTeacherLength - classes[n].getTeacherName().length()) + classes[n].getTeacherName() + "  |");
        }

        //Footer
        System.out.println("+" + "-".repeat(5 + maxClassLength + 5 + maxTeacherLength + 3) + "+");


    }
}
