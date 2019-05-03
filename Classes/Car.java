public class Car {
    //Member Variables or Fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public static void main(String[] args) {

    }

    //Constructor - No Parameters = Default Values
    public Car() {
        //Call Parameterized Constructor with Default Values
        this(4, 4, "prototype", "prototype", "silver");
    }

    //Constructor - With Parameters
    public Car(int doors, int wheels, String model, String engine, String color) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    //Constructor - With Partial Parameters
    public Car(String model, String engine, String color) {
        this (4, 4, model, engine, color);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return this.model;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getColor() {
        return this.color;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getWheels() {
        return this.wheels;
    }


}
