//Abstract classes must be extended, cannot be instantiated
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Implementing requried abstract method
    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    // Implementing requried abstract method
    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat.");
    }
}