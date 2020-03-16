package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        Game game= new Game();
        game.start();





        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Entered name: " + userInput);



        System.out.println( "Welcome to the racing game!" );


        Engine engine1 = new Engine();
        engine1.manufacturer = "Volkswagen";
        engine1.capacity = 2000;

        Car carReference = new Car(engine1);                                                                       //un
        // constructor al clasei
        carReference.name = "Audi";                                                                         //ctrl+shift+Enter -> beteszi a pontosvesszot, ctrl+click pe name,  vissza a mappaba, ahonnan hivtam
        carReference.color = "red";
        carReference.maxSpeed = 260;                                                                        //ctrl+click pe maxSpeed -> informatii despre el
        carReference.mileage = 6.2;                                                                         // ca separator folosim '.'
        carReference.fuelLevel = 100;
        carReference.damaged = true;
                                                                                                            //ctrl+alt+L -> reformat code
//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "Volkswagen";            //ctrl+D duplicate line
//        carReference.engine.capacity = 2000;        //ctrl + /


        double currentDistance = carReference.accelerate(60, 1);
        System.out.println("Current distance: " + currentDistance);

        System.out.println();
        Mechanic mechanic = new Mechanic();
        mechanic.repair(carReference);
        System.out.println("Is car damaged? " + carReference.damaged);


        //One object with two references

        System.out.println("Engine details: ");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);
        System.out.println();



        engine1.capacity = 2100;
        System.out.println("Updated engine details: ");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);
        System.out.println();


        //concatenation - tobb string osszeragasztasa; lipire de stringuri
        System.out.println("Properties of " + carReference.name);
        System.out.println("Color: " + carReference.color);                                                 //ha csak color-t irok? -> meg kell hivnom; variable scope; durata ei de viata
        System.out.println("Max speed of the car: " + carReference.maxSpeed);
        System.out.println("Mile age of the car: " + carReference.mileage);
                //duplicate line??
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Racing number: " + carReference.racingNumber);
        System.out.println("Damaged: " + carReference.damaged);

        //carReference = null; -> am golit

        Car car2 = new Car(new Engine());
        car2.name = "Lambourghini";
        car2.damaged = true;

        System.out.println();
        System.out.println("Properties of " + car2.name);
        System.out.println("Name: " + car2.damaged);
        System.out.println("Color: " + car2.color);                                                         //ctrl+f+f5 -> rerun
        //exit code = 0 -> ok!
        //exit code = 1 -> nem ok! :))
        //null pointer exception

        //ctrl+K -> commit
        //ctrl+shift+K -> push

//        System.out.println();
//        System.out.println(4 % 2 == 0);      //modulo; a maradekot szamolja ki
//        System.out.println(4 % 2);      //modulo; a maradekot szamolja ki
//        System.out.println(4 % 3);


    }
    //itt mar nem hivhatom meg a carReference-szel
}
