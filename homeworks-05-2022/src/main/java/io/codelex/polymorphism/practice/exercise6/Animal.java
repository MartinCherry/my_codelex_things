package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected double animalWeight;
    protected int foodEaten;

    abstract void makeSound();

    void eatFood(Food food) {
        foodEaten += food.getQuantity();
    }

    ;

    public Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;

    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    public static void doesntEat(String type) {
        System.out.println(type + "Doesn't eat this food!");
    }


}
