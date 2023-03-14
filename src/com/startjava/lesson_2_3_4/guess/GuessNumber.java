package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int goalNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("У каждого игрока по 10 попыток");
        Random random = new Random();
        goalNumber = random.nextInt(100) + 1;

        do {
            if (isGuessed(player1) || isGuessed(player2)) {
                break;
            }

            if (!hasAttempts(player1) && !hasAttempts(player2)) {
                System.out.println("Game Over, у обоих игроков закончились попытки");
                break;
            }
        } while (true);

        showPlayerAttempts(player1);
        showPlayerAttempts(player2);
        player1.clearAttempts();
        player2.clearAttempts();
    }

    private boolean isGuessed(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        player.addNumber(input.nextInt());

        if (player.getLastNumber() == goalNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + goalNumber + " c " +
                    player.getAttemptsCount() + " попытки");
            return true;
        }

        if (player.getLastNumber() < goalNumber) {
            System.out.println("Число " + player.getLastNumber() +
                    " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getLastNumber() +
                    " больше того, что загадал компьютер");
        }

        if (!hasAttempts(player)) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }

        return false;
    }

    private boolean hasAttempts(Player player) {
        return player.getAttemptsCount() < 10;
    }

    private void showPlayerAttempts(Player player) {
        System.out.print("Попытки игрока " + player.getName() + ": ");
        for (int i : player.getNumbers()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}