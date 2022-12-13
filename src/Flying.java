public class Flying extends Bird{

    public static void walk(){

    }

    public Flying (String name, int year, String typeOfMovement) {
        super(name, year, typeOfMovement);
    }

    @Override
    public void hunt() {
        System.out.println(" Летающая птица охотится на насекомых");

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" Летающая птица ест насекомых");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println(" Летающая птица спит ночью");
    }

    @Override
    public void move() {
        super.move();
        System.out.println(" Летающая птица"+ getLivingEnvironment());
    }
}

