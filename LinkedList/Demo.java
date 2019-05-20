import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");

        // Adding to Linked List
        // placesToVisit.add("Sydney");
        // placesToVisit.add("Melbourne");
        // placesToVisit.add("Brisbane");
        // placesToVisit.add("Perth");
        // placesToVisit.add("Canberra");
        // placesToVisit.add("Adelaide");
        // placesToVisit.add("Darwin");

        printList(placesToVisit);

        // Inserting a Record
        // placesToVisit.add(1, "Alice Springs");
        addInOrder(placesToVisit, "Alice Springs");

        printList(placesToVisit);

        // Removing a Record
        placesToVisit.remove(4);

        printList(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator(); // Doesn't point to 1st entry

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);

            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // newCity should aappear before this one, Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on to next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }
}