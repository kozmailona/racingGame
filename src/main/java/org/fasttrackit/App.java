package org.fasttrackit;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws Exception {

        Game game = new Game();
        game.start();

//        Map<String, Integer> studentAge = new HashMap<>();
//        studentAge.put("Ilona", 23);
//        studentAge.put("Lara", 21);
//        studentAge.put("Alex", 24);
//
//        Integer age = studentAge.get("Lara");
//
//        for (Map.Entry<String, Integer> entry : studentAge.entrySet()) {
//            System.out.println("Key: " + entry.getKey());
//            System.out.println("Value: " + entry.getValue());
//        }

        //    //wrapper class
//        Set<Integer> uniqueIntegers = new HashSet<>();
//        uniqueIntegers.add(1);
//        uniqueIntegers.add(2);
//        uniqueIntegers.add(3);
//        uniqueIntegers.add(3);
//
//        Iterator<Integer> iterator = uniqueIntegers.iterator();
//
//        //auto-boxing and auto unboxing
//        while (iterator.hasNext()) {
//            int next = iterator.next();
//            System.out.println(next);
//        }

        //        Scanner scanner = new Scanner(System.in);
//
////        try {
////            System.out.println("Enter number: ");
////            int integer = scanner.nextInt();
////            scanner.nextLine();
////            System.out.println("Entered: " + integer);
////        } catch (Exception e) {
////            System.out.println("Invalid number!");
////            scanner.nextLine();
////        }
//
//        System.out.println("Enter numbers: ");
//        int integer1 = scanner.nextInt();
//        int integer2 = scanner.nextInt();
//        int integer3 = scanner.nextInt();
//        int integer4 = scanner.nextInt();
//        System.out.println("Entered: " + integer1);
//        System.out.println("Entered: " + integer2);
//        System.out.println("Entered: " + integer3);
//        System.out.println("Entered: " + integer4);
//
////        System.out.println("Enter string2: ");
////        String s2 = scanner.nextLine();
////        System.out.println("Entered: " + s2);

//        //String pool
//        String a = "test";
//        String b = "test";
//        String c = new String("test");
//
//        System.out.println(a == b);
//        System.out.println(a.equals(c));
//
//        new AutoVehicle(new Engine());
//
//        //method implementation taken from object's class, not from variable's class
//        Vehicle cheater = new CheatingVehicle();
//        cheater.setName("Cheater");
//
//        cheater.accelerate(60,1);
//        System.out.println("Total distance: " + cheater.getTotalDistance());
//
//        ((CheatingVehicle)cheater).fly();
//
//
//        //variable type decided what methods can be invoked
//        //type casting
//
//        ( (CheatingVehicle) cheater).fly();
//
//          Vehicle vehicle1 = new Vehicle();
////        vehicle1.totalVehicleCount = 1;
//
//        Vehicle vehicle2 = new Vehicle();
////        vehicle2.totalVehicleCount = 2;
//
////        Vehicle.totalVehicleCount = 50;
//
//        System.out.println("Total count from vehicle 1: " + vehicle1.getTotalVehicleCount());
//        System.out.println("Total count from vehicle 1: " + vehicle2.getTotalVehicleCount());
//        System.out.println("Total count from Vehicle 1: " + Vehicle.getTotalVehicleCount());
//
//
////        System.out.println("Please enter vehicle name: ");
////        Scanner scanner = new Scanner(System.in);
////        String userInput = scanner.nextLine();
////        System.out.println("Entered name: " + userInput);
//
//        Scanner scanner2 = new Scanner(System.in);
//        int enteredNumber = scanner2.nextInt();
//
//       System.out.println( "Welcome to the racing game!" );
//
//       Car car = new Car();
//
//        Engine engine1 = new Engine();
//        engine1.manufacturer = "Volkswagen";
//        engine1.capacity = 2000;
//
//        Car carReference = new Car(engine1);                                                                        //un
//        // constructor al clasei
//        carReference.setName("Audi");                                                                         //ctrl+shift+Enter -> beteszi a pontosvesszot, ctrl+click pe name,  vissza a mappaba, ahonnan hivtam
//        carReference.setColor("red");
//        carReference.setMaxSpeed(260);                                                                        //ctrl+click pe maxSpeed -> informatii despre el
//        carReference.setMileage(6.2);                                                                         // ca separator folosim '.'
//        carReference.setFuelLevel(100);
//        carReference.setDamaged(true);
//
//        System.out.println("Name: " + carReference.getName());
//        System.out.println(carReference);
//
//        //        carReference.engine = new Engine();
//        //        carReference.engine.manufacturer = "Volkswagen";            //ctrl+D duplicate line
//        //        carReference.engine.capacity = 2000;        //ctrl + /
//
//
//        double currentDistance = carReference.accelerate(60, 1);
//        System.out.println("Current distance: " + currentDistance);
//                                                                                                            //ctrl+alt+L -> reformat code
//
////
////
//        System.out.println();
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(carReference);
//        System.out.println("Is car damaged? " + carReference.isDamaged());
//
////
////        //One object with two references
////
//        System.out.println("Engine details: ");
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.getEngine().capacity);
//        System.out.println();
//
//        engine1.capacity = 2100;
//
//        System.out.println("Updated engine details: ");
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.getEngine().capacity);
//        System.out.println();
//

//        //concatenation - tobb string osszeragasztasa; lipire de stringuri
//        System.out.println("Properties of " + carReference.name);
//        System.out.println("Color: " + carReference.color);                                                 //ha csak color-t irok? -> meg kell hivnom; variable scope; durata ei de viata
//        System.out.println("Max speed of the car: " + carReference.maxSpeed);
//        System.out.println("Mile age of the car: " + carReference.mileage);
//                //duplicate line??
//        System.out.println("Fuel level: " + carReference.fuelLevel);
//        System.out.println("Racing number: " + carReference.racingNumber);
//        System.out.println("Damaged: " + carReference.damaged);
//
//        //carReference = null; -> am golit
//
//        Car car2 = new Car(new Engine());
//        car2.name = "Lambourghini";
//        car2.damaged = true;
//
//        System.out.println();
//        System.out.println("Properties of " + car2.name);
//        System.out.println("Name: " + car2.damaged);
//        System.out.println("Color: " + car2.color);                                                         //ctrl+f+f5 -> rerun
//        //exit code = 0 -> ok!
        //exit code = 1 -> nem ok! :))
        //null pointer exception

        //ctrl+K -> commit
        //ctrl+shift+K -> push

//        System.out.println();
//        System.out.println(4 % 2 == 0);      //modulo; a maradekot szamolja ki
//        System.out.println(4 % 2);      //modulo; a maradekot szamolja ki
//        System.out.println(4 % 3);
//
//
  }
    //itt mar nem hivhatom meg a carReference-szel
}
