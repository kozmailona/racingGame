package org.fasttrackit;

import java.util.Scanner;

public class  Game {

    private Track[] tracks = new Track[3];


    private Vehicle competitor1;
    private Vehicle competitor2;

    public void start() {
        System.out.println("Welcome!");

        int playerCount = getPlayerCountFromUser();

        initializeTracks();
        displayTracks();
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
}
