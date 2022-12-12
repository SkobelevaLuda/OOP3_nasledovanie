public abstract class Amphibian extends Animal{

    public Amphibian(String name, int year) {
        super(name, year);
    }

    public static void hunt(){
        System.out.println("Земноводнные охотятся ночью");

    }

    @Override
    public void eat() {
        System.out.println("Земноводнные питаются насекомыми");

    }

    @Override
    public void sleep() {
        System.out.println("Земноводнные спят днем");

    }

    @Override
    public void move() {
        System.out.println("Земноводнные передвигаются ночью");

    }
}
