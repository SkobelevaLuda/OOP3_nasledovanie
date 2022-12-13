import java.util.Objects;

public abstract class Bird extends Animal{
    public String typeOfMovement;

    public Bird(String name, int year, String typeOfMovement) {
        super(name, year);
        this.typeOfMovement = typeOfMovement;
    }

    public abstract void hunt();

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
        if (!(o instanceof Bird)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Bird bird = (Bird) o;
        return Objects.equals(typeOfMovement, bird.typeOfMovement);
    }

}
