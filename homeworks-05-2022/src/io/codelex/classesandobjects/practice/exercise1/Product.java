package io.codelex.classesandobjects.practice.exercise1;

public class Product {
    String name;
    double priceAtStart;
    int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getPriceAtStart() {
        return priceAtStart;
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public int getAmountAtStart() {
        return amountAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

    @Override
    public String toString() {

        return name + ", price " + String.format("%.2f", priceAtStart) +
                " EUR, amount " + amountAtStart + " units.";
    }
}
