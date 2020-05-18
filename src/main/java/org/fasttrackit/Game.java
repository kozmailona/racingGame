package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class  Game {

    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();
    private Track selectedTrack;
    private boolean winnerNotKnown = true;      //deci nu cunoastem castigatorul
    private int competitorsWithoutFuel = 0;


    private Vehicle competitor1;
    private Vehicle competitor2;

    public void start() throws Exception {
        System.out.println("Welcome!");

        initializeTracks();
        displayTracks();
        Track selectedTrack = getSelectedTrackFromUser();
        System.out.println("Selected track: " + selectedTrack.getName());

        initializeCompetitors();

        while (winnerNotKnown && competitorsWithoutFuel < competitors.size()) {
            playOneRound();
        }
        playOneRound();

//        String test = "a b c d";
//        String[] letters = test.split(" ");
//        System.out.println(letters);

//        Integer.parseInt(letters[0]);
    }

    private void playOneRound() {
        System.out.println("\nNew round: ");

        for (Vehicle vehicle : competitors) {
            System.out.println("It is " + vehicle.getName() + "'s turn.");
            double speed = getAccelerationFromUser();

            vehicle.accelerate(speed);

            if (selectedTrack.getLength() <= vehicle.getTotalDistance()) {
                System.out.println("The winner is: " + vehicle.getName());
                winnerNotKnown = false;

                break;
            }

            if (vehicle.getFuelLevel() <= 0) {
                competitorsWithoutFuel++;
            }

            System.out.println();
        }

    }


    private void initializeCompetitors() {
        int playerCount = getPlayerCountFromUser();

        for (int i = 0; i < playerCount; i++) {
            System.out.println("Creating vehicle for player " + (i + 1));
            String name = getVehicleNameFromUser();

            Vehicle vehicle = new Vehicle();
            vehicle.setName(name);
            vehicle.setFuelLevel(80);
            vehicle.setMaxSpeed(260);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(5, 15)); //limita inferioara, si limita exterioara


            competitors.add(vehicle);
        }
    }


    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Imola");
        track1.setLength(3500);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Rabbit");
        track2.setLength(4000);

        tracks[1] = track2;

        Track track3 = new Track();
        track3.setName("Babi");
        track3.setLength(4500);

        tracks[2] = track3;

    }

    public void displayTracks() {
        System.out.println("Available tracks: ");

        //classic for loop
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName() + " - " + tracks[i].getLength());
                //System.out.println(new Vehicle());
            }
        }
    }

    private Track getSelectedTrackFromUser() throws Exception {
        System.out.println("Please select a track.");

        try {
            Scanner scanner = new Scanner(System.in);
            int trackNumber = scanner.nextInt();
            return tracks[trackNumber - 1];
        } catch (InputMismatchException e) {
            throw new Exception("You have entered an invalid option.");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Wrong number entered.");
        } finally {
            System.out.println("Finally block always executed. ");
        }
    }

    private String getVehicleNameFromUser() {                                           //csak ebben a classban van
                                                                                        // hozzaferesem

        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    public int getPlayerCountFromUser() {
        System.out.println("Please enter number of players: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    private double getAccelerationFromUser() {
        System.out.println("Please enter acceleration speed: ");
        Scanner scanner = new Scanner(System.in);


        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid value, please, try  again.");
            //recursion
            return  getAccelerationFromUser();
        }
    }
}
