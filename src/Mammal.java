public class Mammal extends Animal {
    public int speed;
    public static String typeOfFood;

    public Mammal(String name, int year, int speed, String typeOfFood) {
        super(name, year);
        this.speed = speed;
        this.typeOfFood = typeOfFood;
    }

    public Mammal(String name, int year, String typeOfFood) {
        super(name, year);
        this.typeOfFood = typeOfFood;
    }

    public static void goForValk(){

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }
}
