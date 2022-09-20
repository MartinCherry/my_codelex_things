package io.codelex.classesandobjects.practice.exercise3;


public class Odometer {
    int mileage;

    public Odometer(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void drive(int distance) {
        int mileageBefore = this.getMileage();
        if ((mileageBefore + distance) > 999999) {
            this.setMileage(mileageBefore + distance - 1000000);
        } else {
            this.setMileage(mileageBefore + distance);
        }

    }


}

