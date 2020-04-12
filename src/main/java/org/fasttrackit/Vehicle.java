package org.fasttrackit;

public class Vehicle {

    //static variable / class variable
    private static int totalVehicleCount;

    //instance variables
    private int racingNumber;
    private String name;
    private int maxSpeed;
    private double mileage;
    private String color;
    private double fuelLevel;
    private double totalDistance;
    private boolean damaged;



    public Vehicle() {
        totalVehicleCount++;
    }

    //method overloading
    public double accelerate(double speed) {
        return accelerate(speed, 1);
    }

    public double accelerate(double speed, double durationInHours) {        //semnatura metodei / method signature
        //corpul metodei

        if (fuelLevel <= 0) {
            System.out.println("Not enough fuel.");
            return 0;
        }

        if (speed > maxSpeed) {
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

    public int getRacingNumber() {
        return racingNumber;
    }

    public void setRacingNumber(int racingNumber) {
        this.racingNumber = racingNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    //read-only property
    public static int getTotalVehicleCount() {
        return totalVehicleCount;
    }
}


