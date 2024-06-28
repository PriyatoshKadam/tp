package com.swiggytask;

public class Arena {
    private Player player1;
    private Player player2;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startBattle() {
        while (player1.isAlive() && player2.isAlive()) {
            battleRound(player1, player2);
            if (!player2.isAlive()) break;
            battleRound(player2, player1);
        }

        if (player1.isAlive()) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

    private void battleRound(Player attacker, Player defender) {
        int attackDamage = attacker.attack();
        int defendDamage = defender.defend();
        int damageDealt = Math.max(0, attackDamage - defendDamage);
        defender.defend(damageDealt);
        System.out.println("Attacker dealt " + damageDealt + " damage, defender health is now " + defender.getHealth());
    }
}