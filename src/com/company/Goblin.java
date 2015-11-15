package com.company;

/**
 * Created by jamesonstone on 11/14/15.
 */
public class Goblin extends Monster {
    public static final String GOBLIN_NAME = "GOBLIN";
    public static final int GOBLIN_HEALTH = 5;
    public static final int GOBLIN_DAMAGE = 10;

    public Goblin() {
        super(GOBLIN_NAME, GOBLIN_HEALTH, GOBLIN_DAMAGE);
    }
}
