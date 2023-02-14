package com.startjava.lesson_1.finalhw;

public class MyFirstGame {

    public static void main(String[] args) {
        int playerNum = 79;
        int goalNum = 88;

        while (playerNum != goalNum) {
            if (playerNum > goalNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum -= playerNum - goalNum;
            } else {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum += goalNum - playerNum;
            }
        }

        System.out.println("Вы победили!");
    }
}