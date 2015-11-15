package com.company;

/**
 * Created by jamesonstone on 11/14/15.
 */
public class Zombie extends Monster {
    public static final String ZOMBIE_NAME = "ZOMBIE";
    public static final int ZOMBIE_HEALTH = 10;
    public static final int ZOMBIE_DAMAGE = 5;

    public Zombie() {
        super(ZOMBIE_NAME, ZOMBIE_HEALTH, ZOMBIE_DAMAGE);
    }
}
