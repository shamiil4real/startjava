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
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        return numbersCopy;
    }

    public int getAttemptsCount() {
        return attemptsCount;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) {
        numbers[attemptsCount] = number;
        attemptsCount++;
    }

    public int getLastNumber() {
        return numbers[attemptsCount - 1];
    }

    public void resetAttempts() {
        attemptsCount = 0;
    }
}