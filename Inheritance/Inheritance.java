public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal(1,1,5,4, "Animal");

        Dog husky = new Dog(5, 20, "Scofield", 2, 4, 1, 30, "short");
        Fish shark = new Fish(10, 100, "Rupper", 2, 2, 3);

        husky.eat();
        husky.walk();
        husky.run();

        shark.swim(10);
    }
}
