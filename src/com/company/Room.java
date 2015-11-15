package com.company;

import java.util.Random;

/**
 * Created by jamesonstone on 11/14/15.
 */
public class Room {
    int encounter;
    boolean visited = false;

    public void enter(Player player) {
        Random rand = new Random();
        encounter = rand.nextInt(4 - 1) + 1;

        switch (encounter) {
            case 1: //zombie
                break;
            case 2: //goblin
                break;
            case 3: //healingelixer
                break;
            case 4: //gold
                break;
        }

        visited = true;
    }

    public boolean hasVisited() {
        return visited;
    }


}
