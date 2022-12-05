package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meawww");
    }

    @Override
    void eatFood(Food food) {
        super.eatFood(food);
    }

    @Override
    public String toString() {
        return this.animalType + "[" + this.animalName + ", " + this.breed + ", " + this.livingRegion + ", " + this.foodEaten + "]";
    }
}
