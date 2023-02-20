package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed,
            int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    void scanKaiju() {
        System.out.println("Сканирование произведено");
    }

    @Override
    public String toString() {
        return "Название модели: " + modelName + "\n" +
                "Версия: " + mark + "\n" +
                "Происхождение: " + origin + "\n" +
                "Высота: " + height + " м\n" +
                "Вес: " + weight + " т\n" +
                "Скорость: " + speed + "\n" +
                "Сила: " + strength + "\n" +
                "Броня: " + armor;
    }
}