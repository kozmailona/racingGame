package org.fasttrackit;

public class Vehicle {

    int racingNumber;
    String name;
    int maxSpeed;
    double mileage;
    String color;
    double fuelLevel;
    double totalDistance;
    boolean damaged;

    public double accelerate (double speed, double durationInHours) {        //semnatura metodei / method signature
        //corpul metodei
        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + " h.");

        //local variables
        double travelDistance = speed * durationInHours;
        System.out.println("Travel distance " + travelDistance);

        totalDistance += travelDistance;
        System.out.println("Total travel distance " + totalDistance);


        double usedFuel = travelDistance * mileage / 100;
        System.out.println("Used fuel is " + usedFuel);

        fuelLevel = fuelLevel - usedFuel;

        //same result
       // fuelLevel -= usedFuel;

        System.out.println("Remaining fuel " + fuelLevel);

        return travelDistance;

    }

}
