public abstract class Animal {
    private static String name;
    private static int year;
    private String livingEnvironment;

    public Animal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public abstract void eat();
    public abstract void sleep();

    public abstract void move();
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }
}


