public class Animal {
    private int brain;
    private int body;
    private int size;
    private int weigth;
    private String name;

    public Animal(int brain, int body, int size, int weigth, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weigth = weigth;
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeigth() {
        return weigth;
    }

    public String getName() {
        return name;
    }
}
