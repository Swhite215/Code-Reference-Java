public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int size, int weigth, String name, int eyes, int legs, int tail, int teeth, String coat) {
        //Calls the constructor of the class we are inheriting from
        super(1, 1, size, weigth, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //@Override lets us know we are overriding a method from the class we are inheriting from
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        //Calls the method from the class we are inheriting from
        super.eat();
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }
}
