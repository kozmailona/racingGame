package org.fasttrackit;

public class Vehicle {

    int racingNumber;
    String name;
    int maxSpeed;
    double mileage;
    String color;
    double fuelLevel;
    boolean damaged;

    public void accelerate (double speed, double durationInHours) {        //semnatura metodei / method signature
        //corpul metodei
        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + " h.");

        //local variables
        double travelDistance = speed * durationInHours;
        System.out.println("Travel distance " + travelDistance);

        double usedFuel = travelDistance * mileage / 100;
        System.out.println("Used fuel is " + usedFuel);

        fuelLevel = fuelLevel - usedFuel;

    }

}
