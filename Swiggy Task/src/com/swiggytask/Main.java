package com.swiggytask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Player 1:");
        Player player1 = createPlayer(scanner);

        System.out.println("Enter details for Player 2:");
        Player player2 = createPlayer(scanner);

        Arena arena = new Arena(player1, player2);
        arena.startBattle();

        scanner.close();
    }

    private static Player createPlayer(Scanner scanner) {
        System.out.print("Enter health: ");
        int health = scanner.nextInt();
        System.out.print("Enter strength: ");
        int strength = scanner.nextInt();
        System.out.print("Enter attack: ");
        int attack = scanner.nextInt();

        return new Player(health, strength, attack);
    }
}