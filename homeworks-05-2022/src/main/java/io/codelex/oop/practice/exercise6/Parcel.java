package io.codelex.oop.practice.exercise6;


public class Parcel implements Validable {

    private static final int MAX_LENGTH = 30;
    private static final int MAX_DIMENSIONS = 300;
    private static final int MAX_WEIGHT_NON_EXPRESS = 30;
    private static final int MAX_WEIGHT_EXPRESS = 15;
    private final int xLength;
    private final int yLength;
    private final int zLength;
    private final float weight;
    private final boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validable() {
        if ((this.xLength < MAX_LENGTH) || (this.yLength < MAX_LENGTH) || (this.zLength < MAX_LENGTH)) {
            return false;
        }
        else if (this.xLength + yLength + zLength >= MAX_DIMENSIONS) {
            return false;
        }
        else if (!isExpress && (this.weight < MAX_WEIGHT_EXPRESS)) {
            return false;
        }
        else {
            return !isExpress || (!(this.weight < MAX_WEIGHT_NON_EXPRESS));
        }
    }
}
