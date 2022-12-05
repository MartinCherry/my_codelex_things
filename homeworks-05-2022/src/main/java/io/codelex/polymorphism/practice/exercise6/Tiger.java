package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {
    String livingRegion;


    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }


    @Override
    void makeSound() {

        System.out.println("RAAAAWRRRR");
    }

    public void eatFood(Food food) {

        if (food instanceof Meet) {
            super.eatFood(food);
        }
        else {
            doesntEat(this.animalType);
        }
    }
}
