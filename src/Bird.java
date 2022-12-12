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
}
