package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());

        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "";

         do {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = scanner.next();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (answer.equals("yes"));

        System.out.println("Game Over");
    }
}