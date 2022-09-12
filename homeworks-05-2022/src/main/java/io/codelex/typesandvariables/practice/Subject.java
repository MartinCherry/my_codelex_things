package io.codelex.typesandvariables.practice;

class Subject {
    String className;
    String teacherName;

    void setClassName(String className) {
        this.className = className;
    }

    void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getClassName() {
        return className;
    }
}
