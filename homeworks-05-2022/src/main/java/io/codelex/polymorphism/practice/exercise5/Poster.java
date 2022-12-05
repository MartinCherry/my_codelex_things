package io.codelex.polymorphism.practice.exercise5;

import java.math.BigDecimal;

public class Poster extends Advert {
    int height;
    int width;

    double size;
    int numberOfCopies;
    double costPerCopy;

    double costPerSquareCm = 0.6;


    public Poster(int fee, int height, int width, int numberOfCopies) {
        super(fee);
        this.height = height;
        this.width = width;
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public int cost() {
        return (int) (super.cost() + (getCostPerCopy() * numberOfCopies));
    }

    private double getSize() {
        return this.height * this.width;
    }

    private double getCostPerCopy() {
        return getSize() * this.costPerSquareCm;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster: Area:" + getSize() + "cm2. Copies: " + this.numberOfCopies + ". Cost Per Copy: " + getCostPerCopy();
    }
}
