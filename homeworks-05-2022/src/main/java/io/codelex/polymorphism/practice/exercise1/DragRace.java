package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Audi audi = new Audi("Audi");
        Bmw bmw = new Bmw("BMW");
        Lexus lexus = new Lexus("Lexus");
        Mercedes mercedes = new Mercedes("Mercedes");
        VW vw = new VW("VW");
        Tesla tesla = new Tesla("Tesla");

        List<Car> carList = new ArrayList<>();
        carList.add(audi);
        carList.add(bmw);
        carList.add(lexus);
        carList.add(mercedes);
        carList.add(tesla);
        carList.add(vw);

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                for (int j = 0; j < carList.size() - 1; j++) {
                    if (carList.get(j) instanceof Boost) {
                        ((Boost) carList.get(j)).useNitrousOxideEngine();
                    }
                }
            }
        }

        int maxSpeed = 0;
        Car fastestCar = carList.get(0);
        for (Car car : carList) {
            int tempSpeed = Integer.parseInt(car.showCurrentSpeed());
            if (tempSpeed > maxSpeed) {
                fastestCar = car;
                maxSpeed = tempSpeed;
            }
        }
        System.out.println("Fastest car is " + fastestCar.toString());

    }
}
