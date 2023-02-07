public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setSex("male");
        wolfOne.setName("Rocky");
        wolfOne.setWeight(30.5f);
        wolfOne.setAge(5);
        wolfOne.setColor("Grey");

        System.out.println("Пол: " + wolfOne.getSex());
        System.out.println("Имя: " + wolfOne.getName());
        System.out.println("Вес: " + wolfOne.getWeight() + " кг");
        System.out.println("Возраст: " + wolfOne.getAge() + " лет");
        System.out.println("Окрас: " + wolfOne.getColor());

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}