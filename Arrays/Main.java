import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Variables - Array Intializer Block
        // int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // double[] doubleArray = new double[10];

        // // Assignment - Zero Indexed
        // intArray[5] = 50;
        // doubleArray[0] = 1.4356789;

        // printArray(intArray);

        // int[] myIntegers = getIntegers(5);

        // // Minimum Array
        // System.out.println("Enter count: ");
        // int count = scanner.nextInt();
        // scanner.nextLine();

        // int[] returnedArray = readIntegers(count);

        // int min = findMinimum(returnedArray);

        // Reverse Array
        System.out.println(5 / 2);
        int[] firstArray = { 1, 2, 3, 4, 5 };
        int[] reversedArray = reverseArray(firstArray);

        System.out.println(Arrays.toString(reversedArray));
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

    public static int[] readIntegers(int count) {
        int[] intArray = new int[count];

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.hasNextLine();

            intArray[i] = number;
        }

        return intArray;
    }

    private static int findMinimum(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    private static int[] reverseArray(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        return array;
    }
}

// Common Errors
// - ArrayIndexOuOfBoundsException
// - Starting at 1 not 0 with loop
// - Loop condition should be <
