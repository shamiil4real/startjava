public class JaegerTest {

    public static void main(String[] args) {
        Jaeger typhoon = new Jaeger();
        Jaeger striker = new Jaeger("Striker", "Mark-5", "Australia", 76.2f, 1.85f, 8, 9, 10);

        typhoon.setModelName("Typhoon");
        typhoon.setMark("Mark-4");
        typhoon.setOrigin("China");
        typhoon.setHeight(76.2f);
        typhoon.setWeight(1.72f);
        typhoon.setSpeed(9);
        typhoon.setStrength(8);
        typhoon.setArmor(7);
        System.out.println(striker + "\n\n" + typhoon);

        striker.setSpeed(10);
        striker.setStrength(9);
        striker.setArmor(3);
        System.out.println("\nИзменил характеристики робота " + "\n" + striker + "\n");

        typhoon.drift();
        striker.scanKaiju();
    }
}