package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    //has-a relationship / Aggregation (and composition)
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
}
