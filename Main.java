package se.floremila.träningspel;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        Tärning tärning = new Tärning();
        Tärning tärning1 = new Tärning();
        Tärning tärning2 = new Tärning();
        Tärning tärning3 = new Tärning();


        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Välkommen till mitt tärningspel, där två spelare tävlar mot varandra genom att slå en tärning två gånger var");
        System.out.println();

        System.out.println("Player 1: Skriv ditt nickname");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Player 2: Skriv ditt nickname");
        Player player2 = new Player(scanner.nextLine());

        System.out.println("Låt oss starta");

        playerTärningRoll(player1, scanner, tärning);
        playerTärningRoll(player2, scanner, tärning1);
        playerTärningRoll(player1, scanner, tärning2);
        playerTärningRoll(player2, scanner, tärning3);

        Tärning[] player1Tärningar = {tärning, tärning2};
        Tärning[] player2Tärningar = {tärning1, tärning3};

        Score scorePlayer1 = new Score(player1Tärningar, player1);
        Score scorePlayer2 = new Score(player2Tärningar, player2);

        int totalPlayer1 = scorePlayer1.getTotalScore();
        int totalPlayer2 = scorePlayer2.getTotalScore();

        System.out.println(player1.getNickname() + " du fick " + totalPlayer1 + " poäng");
        System.out.println(player2.getNickname() + " du fick " + totalPlayer2 + " poäng");

        vinnarePlayer(totalPlayer1, totalPlayer2, player1, player2);


    }

    public static void playerTärningRoll(Player player, Scanner scanner, Tärning tärning) {
        System.out.println(player.getNickname() + " tryck return för att slå en tärning");
        scanner.nextLine();
        tärning.rollTärning();
        System.out.println("Du fick " + tärning.rollTärning() + " poäng");
        System.out.println("-----------------------");
    }

    public static void vinnarePlayer(int totalPlayer1, int totalPlayer2, Player player1, Player player2) {
        if (totalPlayer1 > totalPlayer2) {
            System.out.println("Grattis " + player1.getNickname() + " du vann!");
        } else if (totalPlayer1 < totalPlayer2) {
            System.out.println("Grattis " + player2.getNickname() + " du vann!");
        } else {
            System.out.println("Ny fick samma poäng, spela igen!");
        }

    }


}






