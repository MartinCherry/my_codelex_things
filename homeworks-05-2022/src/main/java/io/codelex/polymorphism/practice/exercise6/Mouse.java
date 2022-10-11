package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("PiiPiiPii");
    }

    @Override
    void eatFood(Food food) {
        if (food instanceof Vegetable) {
            super.eatFood(food);
        }
        else {
            doesntEat(this.animalType);
        }

    }
}
