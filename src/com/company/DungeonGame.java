package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jamesonstone on 11/14/15.
 */
public class DungeonGame implements Game{
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean inPlay = true;
        int role = 0;
        int door = 0;
        Player player = null;


        System.out.println("Dungeon Game");
        System.out.println("YOU'RE IN THE DUNGEONS OF A CASTLE. YOU MUST ESCAPE!");
        System.out.println("Explore the maze, find 100GP and the evil professor will let you go!");
        System.out.println("Which role would you like to play?");
        System.out.println("[1] Warrior");
        System.out.println("[2] Thief");

        try {
            role = in.nextInt();
            if(role == 1) {
                player = new Warrior();
            } else {
                player = new Thief();
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid player!");
        }

        System.out.println("You've selected: " + player.name);


        while (inPlay) {
            System.out.println("================================");
            System.out.println("HP: " + player.health);
            System.out.println("GP: " + player.gold);

            System.out.println("You're in a room. Select which door to move to [1-25]");
            door = in.nextInt();

            if(door > rooms.size()) {
                System.out.println("Please enter a valid room number");
            }

            rooms.get(door);



            System.out.println("ROLE: " + role);
            System.out.println("DOOR: " + door);


            inPlay = false;
        }
    }

    public int play() {

        return 0;
    }
}
