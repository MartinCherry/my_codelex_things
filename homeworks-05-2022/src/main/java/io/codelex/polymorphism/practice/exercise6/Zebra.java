package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Dipadu Dapadu");
    }

    @Override
    void eatFood(Food food) {
        if (food instanceof Meet) {
            doesntEat(this.animalType);
        }
        else {
            super.eatFood(food);
        }

    }
}
