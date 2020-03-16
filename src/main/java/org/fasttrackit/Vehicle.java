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

        if(fuelLevel <= 0) {
            System.out.println("Not enough fuel.");
            return 0;
        }

        if (speed < maxSpeed) {
            System.out.println("Max speed exceeded.");
            return 0;
        } else if (speed == maxSpeed) {
            System.out.println("Be careful! Max speed reached.");
        } else {
            System.out.println("Valid speed entered.");
        }

        //todo: use more fuel if speed > 120
            double milaegeMultiplier = 1;
            if (speed > 120) {
                milaegeMultiplier = speed / 100;

            }

            System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + " h.");


        //local variables
        double travelDistance = speed * durationInHours;
        System.out.println("Travel distance " + travelDistance);

        totalDistance += travelDistance;
        System.out.println("Total travel distance " + totalDistance);


        double usedFuel = travelDistance * mileage / 100;
        System.out.println("Used fuel is " + usedFuel);

        usedFuel *= milaegeMultiplier;

        fuelLevel = fuelLevel - usedFuel;

        //same result
       // fuelLevel -= usedFuel;

        System.out.println("Remaining fuel " + fuelLevel);

        return travelDistance;

    }

        public void decelerate() {
        //TODO: implement this
        System.out.println("This is just a demo method.");
        }
}
