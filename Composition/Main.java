public class Main {
    public static void main(String[] args) {
        //Classes that will make up the PC
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27-Inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("B2-200", "Asus", 4, 6, "v2.44");

        //Composition of Classes
        PC thePc = new PC(theCase, monitor, motherboard);

        //Accessing Composition Classes using Getters
        thePc.getMonitor().drawPixelAt(1,2, "green");
        thePc.getCase().pressPowerButton();
        thePc.getMotherboard().loadProgram("Final Fantasy VII");


    }
}