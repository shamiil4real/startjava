package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("У каждого игрока по 10 попыток");
        Random random = new Random();
        int goalNumber = random.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print(player1.getName() + ", введите число: ");
            player1.addAttempt();
            player1.setElementToArray(player1.getNumbers(), input.nextInt());

            if (isGoalNumber(player1, goalNumber)) {
                player1.showPlayerAttempts(); player2.showPlayerAttempts();
                break;
            }

            if (!isEnoughAttempts(player1)) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }

            System.out.print(player2.getName() + ", введите число: ");
            player2.addAttempt();
            player2.setElementToArray(player2.getNumbers(), input.nextInt());

            if (isGoalNumber(player2, goalNumber)) {
                player1.showPlayerAttempts(); player2.showPlayerAttempts();
                break;
            }

            if (!isEnoughAttempts(player2)) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
            }

            if (!isEnoughAttempts(player1) && !isEnoughAttempts(player2)) {
                System.out.println("Game Over, у обоих игроков закончились попытки");
                break;
            }
        } while (true);

        resetGame(player1, player2);
    }

    private static boolean isGoalNumber(Player player, int goalNumber) {
        if (player.getElementFromArray(player.getNumbers(), player.getAttemptsCount()) == goalNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + goalNumber + " c " +
                    player.getAttemptsCount() + " попытки");
            return true;
        }

        if (player.getElementFromArray(player.getNumbers(), player.getAttemptsCount()) < goalNumber) {
            System.out.println("Число " + player.getElementFromArray(player.getNumbers(), player.getAttemptsCount()) +
                    " меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Число " + player.getElementFromArray(player.getNumbers(), player.getAttemptsCount()) +
                    " больше того, что загадал компьютер");
            return false;
        }
    }

    private static boolean isEnoughAttempts(Player player) {
        if (player.getAttemptsCount() < 10) {
            return true;
        } else {
            return false;
        }
    }

    private static void resetGame(Player player1, Player player2) {
        Arrays.fill(player1.getNumbers(), 0, player1.getAttemptsCount(), 0);
        Arrays.fill(player2.getNumbers(), 0, player2.getAttemptsCount(), 0);
        player1.resetAttempts(); player2.resetAttempts();
    }
}