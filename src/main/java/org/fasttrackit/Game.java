package org.fasttrackit;

import java.util.Scanner;

public class Game {

    public void start() {
        System.out.println("Welcome!");

        int playerCount = getPlayerCountFromUser();



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
