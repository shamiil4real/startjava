package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private static int goalNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("У каждого игрока по 10 попыток");
        Random random = new Random();
        goalNumber = random.nextInt(100) + 1;

        do {
            makeTurn(player1);
            if (!isGoalNumber(player1)) {
                makeTurn(player2);
            } else {
                break;
            }

            if (!isEnoughAttempts(player1) && !isEnoughAttempts(player2)) {
                System.out.println("Game Over, у обоих игроков закончились попытки");
                break;
            }
        } while (!isGoalNumber(player2));

        showPlayerAttempts(player1); showPlayerAttempts(player2);
        resetGame(player1, player2);
    }

    private static void makeTurn(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        player.addNumber(input.nextInt());

        if (player.getLastNumber() == goalNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + goalNumber + " c " +
                    player.getAttemptsCount() + " попытки");
        }

        if (player.getLastNumber() < goalNumber) {
            System.out.println("Число " + player.getLastNumber() +
                    " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getLastNumber() +
                    " больше того, что загадал компьютер");
        }

        if (!isEnoughAttempts(player)) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
    }

    private static boolean isGoalNumber(Player player) {
        if (player.getLastNumber() == goalNumber) {
            return true;
        } else {
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

    private static void showPlayerAttempts(Player player) {
        System.out.print("Попытки игрока " + player.getName() + ": ");
        for (int i = 0; i < player.getNumbers().length; i++) {
            if (player.getNumbers()[i] == 0) {
                break;
            }
            System.out.print(player.getNumbers()[i] + " ");
        }
        System.out.println();
    }

    private static void resetGame(Player player1, Player player2) {
        Arrays.fill(player1.getNumbers(), 0, player1.getAttemptsCount(), 0);
        Arrays.fill(player2.getNumbers(), 0, player2.getAttemptsCount(), 0);
        player1.resetAttempts(); player2.resetAttempts();
    }
}