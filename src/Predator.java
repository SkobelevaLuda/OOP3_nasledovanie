public class Predator extends Mammal{

    public static void hunt(){
        System.out.println("Хищник охотится.");

    }

    public Predator(String name, int year, int speed, String typeOfFood) {
        super(name, year, speed, typeOfFood);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Хищник питается "+ getTypeOfFood());
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println(" Хищник спит днем");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Хищник передвигается бегом");
    }

}

