package com.company;

/**
 * Created by jamesonstone on 11/14/15.
 */
public class Thief extends Player {
    public static final int THIEF_HEALTH = 70;
    public static final String THIEF_NAME = "Thief";
    public static final int THIEF_GOLD = 20;
    public static final int THIEF_DAMAGE = 10;

    public Thief() {
        super(THIEF_NAME, THIEF_HEALTH, THIEF_DAMAGE);
    }
}
