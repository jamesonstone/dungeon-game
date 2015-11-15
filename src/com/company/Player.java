package com.company;

/**
 * Created by jamesonstone on 11/14/15.
 */
public class Player extends Character {
    public int gold;
    public double lootModifier;

    public Player(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attack(Monster target) {}

    public void onHeal(int health) {
        super.health = super.health + health;
    }

    public void onLoot(int gp) {
        gold = gold + gp;
    }
}
