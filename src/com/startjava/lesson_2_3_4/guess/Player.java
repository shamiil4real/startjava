package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int attemptsCount;

    public Player(String name) {
        this.name = name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void addAttempt() {
        attemptsCount++;
    }

    public int getAttemptsCount() {
        return attemptsCount;
    }

    public String getName() {
        return name;
    }

    public void setElementToArray(int[] array, int element) {
        array[attemptsCount - 1] = element;
    }

    public int getElementFromArray(int[] array, int index) {
        return array[index - 1];
    }

    public void showPlayerAttempts() {
        System.out.print("Попытки игрока " + name + ": ");
        int[] playersTry = Arrays.copyOf(numbers, attemptsCount);
        for (int i = 0; i < playersTry.length; i++) {
            if (playersTry[i] == 0) {
                break;
            }
            System.out.print(playersTry[i] + " ");
        }
        System.out.println();
    }

    public void resetAttempts() {
        attemptsCount = 0;
    }
}