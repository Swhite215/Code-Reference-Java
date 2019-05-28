import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<Integer>(); // Assignment of type of data
        items.add(1);
        items.add(2);
        // items.add("test"); // Error because of assigned data type

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println(i * 2);
        }
    }
}