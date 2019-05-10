import java.util.ArrayList;

public class GroceryList {
    public static void main(String[] args) {

    }

    // ArrayList - Resizable and Dynamic Aray
    private ArrayList<String> groceryList = new ArrayList<String>();

    // Add element to ArrayList
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // Print elements of ArrayList
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // Update element in ArrayList
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
    }

    // Remove element in ArrayList
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    // Find an element in ArrayList
    public String findItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);

        if (position >= 0) {
            return groceryList.get(position);
        }

        return null;
    }
}