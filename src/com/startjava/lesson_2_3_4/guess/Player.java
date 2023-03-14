package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int attemptsCount;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attemptsCount);
    }

    public void addNumber(int number) {
        numbers[attemptsCount] = number;
        attemptsCount++;
    }

    public int getLastNumber() {
        return numbers[attemptsCount - 1];
    }

    public int getAttemptsCount() {
        return attemptsCount;
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, attemptsCount, 0);
        attemptsCount = 0;
    }
}