package io.codelex.classesandobjects.practice.exercise6;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        //fixme

        double energyDrinkers = calculateEnergyDrinkers(NUMBERED_SURVEYED, PURCHASED_ENERGY_DRINKS);
        double preferCitrus = calculatePreferCitris(PREFER_CITRUS_DRINKS);

        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed, double purchased) {

        return numberSurveyed * purchased;

//        throw new NoCodeWrittenException();
    }

    public static double calculatePreferCitris(double preferCitrus) {
        return (calculateEnergyDrinkers(NUMBERED_SURVEYED, PURCHASED_ENERGY_DRINKS) * preferCitrus);

//        throw new NoCodeWrittenException();
    }
}
