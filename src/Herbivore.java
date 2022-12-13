public class Herbivore extends Mammal{
    public static String typeOfFood;
    public Herbivore(String name, int year, int speed, String typeOfFood) {
        super(name, year, speed);
        this.typeOfFood = typeOfFood;
    }

    public static String getTypeOfFood() {
        return typeOfFood;
    }

    public static void setTypeOfFood(String typeOfFood) {
        Herbivore.typeOfFood = typeOfFood;
    }

    public static void graze(){
        System.out.println(" Травоядное пасется.");

    }

    @Override
    public void eat() {
        System.out.println(" Травоядное питается "+ getTypeOfFood());
    }

    @Override
    public void sleep() {
        System.out.println(" Травоядное спит ночью ");
    }

    @Override
    public void move() {
        System.out.println(" Травоядное гуляет по траве ");
    }
}
