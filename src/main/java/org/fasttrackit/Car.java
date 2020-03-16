package org.fasttrackit;
//"is a" relationship / inheritance
public class Car extends AutoVehicle {

    /*instance variables; variabile de instanta -> obiectul respectiv, concret, real
    valorile lor va fi independente
    */

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }

    //constructor overloading
    public Car() {
        super(new Engine());
    }
}
