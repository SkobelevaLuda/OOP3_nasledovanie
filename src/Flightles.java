public class Flightles extends Bird{

    public static void walk(){

    }

    public Flightles(String name, int year, String typeOfMovement) {
        super(name, year, typeOfMovement);
    }

    @Override
    public void hunt() {
        System.out.println(" Не летающая птица охотится на насекомых");

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" Не летающая птица ест насекомых");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println(" Не летающая птица спит ночью");
    }

    @Override
    public void move() {
        super.move();
        System.out.println(" Не летающая птица"+ getLivingEnvironment());
    }
}
