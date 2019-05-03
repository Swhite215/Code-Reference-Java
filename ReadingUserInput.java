import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            int age = 2019 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your age is: " + age);
            } else {
                System.out.println("A valid age was not entered.");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        //int sum = readUserInputSum(10, scanner);
        //int sum = readUserInputSumChallenge(10, scanner);
        //System.out.println("The sum of all your numbers is: " + sum);

        readUserInputMaxAndMinChallenge(scanner);

        scanner.close();
    }


    public static int readUserInputSum(int numberCount, Scanner scanner) {
        int count = 1;
        int sum = 0;

        while (count <= numberCount) {
            System.out.println("Enter number #" + count);

            int number = scanner.nextInt();
            sum += number;
            count++;

        }

        scanner.close();
        return sum;

    }

    public static int readUserInputSumChallenge(int numberCount, Scanner scanner) {
        int counter = 0;
        int sum = 0;

        while(true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;

                if (counter == numberCount) {
                    break;
                }

            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        scanner.close();
        return sum;
    }

    public static void readUserInputMaxAndMinChallenge(Scanner scanner) {
        int counter = 0;
        int numberOne = 0;
        int numberTwo = 0;

        while (true) {
            int order = counter + 1;

            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                if (order == 1) {
                    numberOne = scanner.nextInt();
                } else if (order == 2) {
                    numberTwo = scanner.nextInt();
                }

                counter++;

                if (counter == 2) {
                    break;
                }

            } else {
                System.out.println("Invalid number entered");
            }
        }

        if (numberOne > numberTwo) {
            System.out.println("Maximum Number is: " + numberOne + ", Miniumum Number is: " + numberTwo);
        } else if (numberOne < numberTwo) {
            System.out.println("Maximum Number is: " + numberTwo + ", Miniumum Number is: " + numberOne);
        } else {
            System.out.println("The Maximum and Miniumum are the same: " + numberOne);
        }
    }

}
