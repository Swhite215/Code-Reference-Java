// Abstract precedes class
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Behaviors without specific implementation
    public abstract void eat();

    public abstract void breathe();

    public String getName() {
        return name;
    }
}