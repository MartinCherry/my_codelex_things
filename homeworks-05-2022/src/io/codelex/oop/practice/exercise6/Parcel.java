package io.codelex.oop.practice.exercise6;

public class Parcel implements Validable {
    private final int xLenght;
    private final int yLenght;
    private final int zLenght;
    private final float weight;
    private final boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLenght = xLength;
        this.yLenght = yLength;
        this.zLenght = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validable() {
        if ((this.xLenght < 30) || (this.yLenght < 30) || (this.zLenght < 30)) {
            return false;
        } else if (this.xLenght + yLenght + zLenght >= 300) {
            return false;
        } else if (!isExpress && (this.weight < 15)) {
            return false;
        } else return !isExpress || (!(this.weight < 30));
    }
}
