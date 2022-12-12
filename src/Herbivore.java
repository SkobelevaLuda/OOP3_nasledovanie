public class Herbivore extends Mammal{
    public Herbivore(String name, int year, int speed, String typeOfFood) {
        super(name, year, speed, typeOfFood);
    }

    public static void graze(){
        System.out.println(" Травоядное пасется.");

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" Травоядное питается "+ getTypeOfFood());
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println(" Травоядное спит ночью ");
    }

    @Override
    public void move() {
        super.move();
        System.out.println(" Травоядное гуляет по траве ");
    }
}
