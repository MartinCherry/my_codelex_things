package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    String livingRegion;


    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return this.animalType + "[" + this.animalName + ", " + this.animalWeight + ", " + this.foodEaten + "]";
    }
}
