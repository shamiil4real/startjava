package com.startjava.lesson_2_3.person;

public class Person {

    String sex = "male";
    String name = "Tom";
    float height = 1.95f;
    float weight = 123.5f;
    int age = 100;

    void move() {
        System.out.println("moving");
    }

    void sit() {
        System.out.println("sitting");
    }

    void run() {
        System.out.println("running");
    }

    String speak() {
        return "hello!";
    }

    void learnJava () {
        System.out.println("learning Java");
    }
}