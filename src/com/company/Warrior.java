package com.company;

/**
 * Created by jamesonstone on 11/14/15.
 */
public class Warrior extends Player {
    public static final int WARRIOR_HEALTH = 100;
    public static final String WARRIOR_NAME = "WARRIOR";
    public static final int WARRIOR_GOLD = 0;
    public static final int WARRIOR_DAMAGE = 15;

    public Warrior() {
        super(WARRIOR_NAME, WARRIOR_HEALTH, WARRIOR_DAMAGE);
    }
}
