public class Predator extends Mammal{
    public static String typeOfFood;

    public static void hunt(){
        System.out.println("Хищник охотится.");

    }

    public Predator(String name, int year, int speed, String typeOfFood) {
        super(name, year, speed);
        this.typeOfFood = typeOfFood;
    }

    public static String getTypeOfFood() {
        return typeOfFood;
    }

    public static void setTypeOfFood(String typeOfFood) {
        Predator.typeOfFood = typeOfFood;
    }

    @Override
    public void eat() {
        System.out.println("Хищник питается "+ getTypeOfFood());
    }

    @Override
    public void sleep() {
        System.out.println(" Хищник спит днем");
    }

    @Override
    public void move() {
        System.out.println("Хищник передвигается бегом");
    }

}

