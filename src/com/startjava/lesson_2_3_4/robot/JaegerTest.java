package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger typhoon = new Jaeger();
        typhoon.setModelName("Typhoon");
        typhoon.setMark("Mark-4");
        typhoon.setOrigin("China");
        typhoon.setHeight(76.2f);
        typhoon.setWeight(1.72f);
        typhoon.setSpeed(9);
        typhoon.setStrength(8);
        typhoon.setArmor(7);

        Jaeger striker = new Jaeger("Striker", "Mark-5", "Australia", 76.2f, 1.85f, 8, 9, 10);
        striker.setSpeed(10);
        striker.setStrength(9);
        striker.setArmor(3);

        System.out.println(striker + "\n\n" + typhoon + "\n");

        typhoon.drift();
        striker.scanKaiju();
    }
}