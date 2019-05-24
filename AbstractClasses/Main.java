public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Shiba Inu");
        dog.breathe();
        dog.eat();

        Hawk bird = new Hawk("Laser Wing");
        bird.breathe();
        bird.eat();
        bird.fly();
    }
}