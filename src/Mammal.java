import java.util.Objects;

public class Mammal extends Animal {
    public int speed;


    public Mammal(String name, int year, int speed) {
        super(name, year);
        this.speed = speed;
    }

    public static void goForValk(){

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Mammal)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Mammal mammal = (Mammal) o;
        return getSpeed() == mammal.getSpeed();
    }

}
