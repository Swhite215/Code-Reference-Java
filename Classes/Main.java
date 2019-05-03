
public class Main {
    public static void main(String[] args) {
        //Getters and Setters
        Car porsche = new Car();

        porsche.setColor("Green");
        porsche.setDoors(4);
        porsche.setEngine("v6");
        porsche.setModel("Carrera");
        porsche.setWheels(4);

        System.out.println("Porsche color is " + porsche.getColor());
        System.out.println("Porsche number of doors is " + porsche.getDoors());
        System.out.println("Porsche engine is " + porsche.getEngine());
        System.out.println("Porsche model is " + porsche.getModel());
        System.out.println("Porsche number of wheels is " + porsche.getWheels());

        //Constructor
        Car bentley = new Car(4, 4, "continental", "v8", "silver");

        System.out.println("Bentley color is " + bentley.getColor());
        System.out.println("Bentley number of doors is " + bentley.getDoors());
        System.out.println("Bentley engine is " + bentley.getEngine());
        System.out.println("Bentley model is " + bentley.getModel());
        System.out.println("Bentley number of wheels is " + bentley.getWheels());
    }
}
