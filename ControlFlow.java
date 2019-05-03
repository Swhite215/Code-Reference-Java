public class ControlFlow {
    public static void main(String[] args) {

    }

    private static void printDayOfTheWeekSwitch(int day) {
        //Switch Case
        switch(day) {
            case 0:
                System.out.println("Today is Sunday.");
                break;
            case 1:
                System.out.println("Today is Monday.");
                break;
            case 2:
                System.out.println("Today is Tuesday.");
                break;
            case 3:
                System.out.println("Today is Wednesday.");
                break;
            case 4:
                System.out.println("Today is Thursday.");
                break;
            case 5:
                System.out.println("Today is Friday.");
                break;
            case 6:
                System.out.println("Today is Saturday.");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }

    private static void printDayOfTheWeekConditional(int day) {
        //Conditional Logic
        if (day == 0) {
            System.out.println("Today is Sunday.");
        } else if (day == 1) {
            System.out.println("Today is Monday.");
        } else if (day == 2) {
            System.out.println("Today is Tuesday.");
        } else if (day == 3) {
            System.out.println("Today is Wednesday.");
        } else if (day == 4) {
            System.out.println("Today is Thursday.");
        } else if (day == 5) {
            System.out.println("Today is Friday.");
        } else if (day == 6) {
            System.out.println("Today is Saturday.");
        } else {
            System.out.println("Invalid day.");
        }
    }

    private static void printForLoop(int maximum) {
        //For Loop
        for (int i = 0; i <= maximum; i++) {
            if (i == 3) {
                continue; //Will not print 3 and will jump to next iteration
            } else if (i == 10) {
                break; //Will stop iterating and exit the loop
            }

            System.out.println(i);
        }
    }

    private static void printWhileLoop(int maximum) {
        int count = 0;

        //While Loop
        while(count < maximum) {
            System.out.println(count);
            count++;
        }
    }

    private static void printDoWhileLoop(int maximum) {
        int count = 0;

        //Do While Loop
        do {
            System.out.println(count);
            count++;
        } while (count < maximum);
    }

    private static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
