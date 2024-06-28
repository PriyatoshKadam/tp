package com.swiggytask;

import org.junit.*;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
    }

    @Test
    public void testPlayerAttackAndDefend() {
        Player player = new Player(50, 5, 10);
        assertTrue(player.attack() >= 10 && player.attack() <= 60);
        assertTrue(player.defend() >= 5 && player.defend() <= 30);
    }

    @Test
    public void testPlayerHealthReduction() {
        Player player = new Player(50, 5, 10);
        player.defend(20);
        assertEquals(30, player.getHealth());
    }
}