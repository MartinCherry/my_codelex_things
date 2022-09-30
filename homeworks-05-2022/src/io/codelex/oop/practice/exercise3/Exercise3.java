package io.codelex.oop.practice.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        Manufacturer audi = new Manufacturer("Audi", 1756, "Germany");
        Manufacturer volksWagen = new Manufacturer("VolksWagen", 1654, "Germany");
        Manufacturer peugeot = new Manufacturer("Peugeot", 1976, "France");
        Manufacturer porche = new Manufacturer("Porche", 1967, "Germany");
        Manufacturer bmw = new Manufacturer("BMW", 1945, "Germany");
        Manufacturer skoda = new Manufacturer("Skoda", 1957, "Czech");

        CarService carService = new CarService();

        Car car1 = new Car("Audi", "A6", 59000, 2020, EngineType.V12, audi);
        Car car2 = new Car("VolksWagen", "Polo", 23000, 2019, EngineType.V6, volksWagen, audi, porche);
        Car car3 = new Car("Peugeot", "207", 18665, 2017, EngineType.S3, peugeot);
        Car car4 = new Car("Audi", "A4", 24734, 2018, EngineType.V6, audi, volksWagen);
        Car car5 = new Car("BMW", "315", 21665, 2019, EngineType.S3, bmw);
        Car car6 = new Car("Skoda", "Octavia", 17345, 2017, EngineType.S4, skoda, volksWagen);

        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);
        carService.addCar(car5);
        carService.addCar(car6);

//        System.out.println(carService.mostExpensive());
        System.out.println(carService.getEngine(EngineType.V6));
//
//        System.out.println(carService.mostExpensive());
//        System.out.println(carService.cheapest());
//
//        System.out.println(carService.atleastThreeManufacturers());
//        System.out.println(carService.findCar("Skoda"));
//        System.out.println(carService.filterByManufacturerYears("<", 2022));

//        System.out.println(carService.findManufacturers(audi));


    }
}
