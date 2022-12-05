package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<Animal> animalsList = new ArrayList<>();


        boolean moreAnimals = true;

        while (moreAnimals) {
            System.out.println("Enter animal: ");
            String[] animalArr = in.nextLine().split(" ");
            Animal enteredAnimal = null;
            Food enteredFood = null;

            if (animalArr[0].equals("End")) {
                moreAnimals = false;
                continue;
            }
            else {
                switch (animalArr[0]) {
                    case "Tiger":
                        enteredAnimal = new Tiger(animalArr[1], animalArr[0], Double.parseDouble(animalArr[2]), animalArr[3]);
                        break;
                    case "Zebra":
                        enteredAnimal = new Zebra(animalArr[1], animalArr[0], Double.parseDouble(animalArr[2]), animalArr[3]);
                        break;
                    case "Cat":
                        enteredAnimal = new Cat(animalArr[1], animalArr[0], Double.parseDouble(animalArr[2]), animalArr[3], animalArr[4]);
                        break;
                    case "Mouse":
                        enteredAnimal = new Mouse(animalArr[1], animalArr[0], Double.parseDouble(animalArr[2]), animalArr[3]);
                        break;
                }
            }
            enteredAnimal.makeSound();
            animalsList.add(enteredAnimal);
            while (true) {
                System.out.println("Enter food for animal: ");
                String[] foodArr = in.nextLine().split(" ");
                if (foodArr[0].equals("Meet")) {
                    enteredFood = new Meet(Integer.parseInt(foodArr[1]));
                    break;
                }
                else if (foodArr[0].equals("Vegetable")) {
                    enteredFood = new Vegetable(Integer.parseInt(foodArr[1]));
                    break;
                }
                else {
                    System.out.println("There is not this type of food");
                }
            }
            enteredAnimal.eatFood(enteredFood);
            System.out.println(enteredAnimal);
            System.out.println("Thank you. \n");


        }
        animalsList.forEach(animal -> System.out.println(animal.toString()));


    }
}
