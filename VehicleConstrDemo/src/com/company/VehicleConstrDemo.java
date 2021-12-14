package com.company;

public class VehicleConstrDemo {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(2, 4, 130, 30);
        Vehicle bus = new Vehicle(45, 4, 120, 25);

        double interval = 1;
        double distanceCar = car.distance(interval) ;
        double distanceBus = bus.distance(interval) ;

        System.out.println("Автомобиль с " + car.passengers  +  "пассажирами" + "проедет за час" + distanceCar + "км");
        System.out.println("Автобус с "+ bus.passengers + "пассажирами" + "проедет за час" + distanceBus + "км");
    }
}
