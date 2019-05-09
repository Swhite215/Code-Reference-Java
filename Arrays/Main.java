import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Variables - Array Intializer Block
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double[] doubleArray = new double[10];

        // Assignment - Zero Indexed
        intArray[5] = 50;
        doubleArray[0] = 1.4356789;

        printArray(intArray);

        int[] myIntegers = getIntegers(5);
    }

    public static void printArray(int[] array) {
        // Looping
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;

    }

    public static double getAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }
}