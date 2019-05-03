
public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

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
    }
}
