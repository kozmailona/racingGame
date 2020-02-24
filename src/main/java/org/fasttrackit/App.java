package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the racing game!" );

        Car carReference = new Car();                   //un constructor al clasei
        carReference.name = "Audi";                     //ctrl+shift+Enter -> beteszi a pontosvesszot, ctrl+click pe name,  vissza a mappaba, ahonnan hivtam
        carReference.color = "red";
        carReference.maxSpeed = 260;                    //ctrl+click pe maxSpeed -> informatii despre el
        carReference.mileage = 6.2;                     // ca separator folosim '.'
        //ctrl+alt+L -> reformat code

        //concatenation - tobb string osszeragasztasa; lipire de stringuri
        System.out.println("Properties of " + carReference.name);
        System.out.println("Color: " + carReference.color);     //ha csak color-t irok? -> meg kell hivnom; variable scope; durata ei de viata
        System.out.println("Max speed of the car: " + carReference.maxSpeed);
        System.out.println("Mile age of the car: " + carReference.mileage);
                //duplicate line??
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Racing number: " + carReference.racingNumber);
        System.out.println("Damaged: " + carReference.damaged);

        //carReference = null; -> am golit

        Car car2 = new Car();
        car2.name = "Lambourghini";
        car2.damaged = true;

        System.out.println();
        System.out.println("Properties of " + car2.name);
        System.out.println("Name: " + car2.damaged);
        System.out.println("Color: " + car2.color);     //ctrl+f+f5 -> rerun
        //exit code = 0 -> ok!
        //exit code = 1 -> nem ok! :))
        //null pointer exception

        //ctrl+K -> commit

    }
    //itt mar nem hivhatom meg a carReference-szel
}