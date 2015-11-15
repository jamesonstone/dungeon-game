package com.company;

/**
 * Created by jamesonstone on 11/14/15.
 */
public class Character {
    public int health;
    public String name;
    public int damage;

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    protected void attack(Character target) {}

    public void onHit(int damage) {}
}
