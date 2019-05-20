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

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary.");
            return;
        } else {
            System.out.println("Now visiting: " + listIterator.next());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
            case 0:
                System.out.println("Holiday (Vacation) over");
                quit = true;
                break;
            case 1:
                if (!goignForward) {
                    if (listIterator.hasNext()) {
                        listIterator.next();
                    }

                    goingForward = true;
                }
                if (listIterator.hasNext()) {
                    System.out.println("Now visiting: " + listIterator.next());
                } else {
                    System.out.println("Reached the end of the list.");
                    goingForward = false;
                }
                break;
            case 2:
                if (goingForward) {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    goingForward = false;
                }
                if (listIterator.hasPrevious()) {
                    System.out.println("Now visiting: " + listIterator.previous());
                } else {
                    System.out.println("We are at the start of the list.");
                    goingForward = true;
                }
                break;
            case 3:
                printMenu();
                break;
            default:
                System.out.println("Please enter 0, 1, or 2");
                printMenu();
                break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \n press ");
        System.out.println("0 - Quit\n " + "1 - Go to Next City\n" + "2 - Go to Previous City\n" + "3 - Print Menu Again")
    }
}