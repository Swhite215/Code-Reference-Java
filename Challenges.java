public class Challenges {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(1.234, 1.254);
        printMegaBytesAndKiloBytes(2500);
        double circleArea = area(5.0);
        double rectangleArea = area(4.0, 5.0);
        boolean shared = hasSharedDigit(12, 13);
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int one = (int)(a * 1000);
        int two = (int)(b * 1000);

        if (one == two) {
            return true;
        } else {
            return false;
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        //Integer Division
        int mb = kiloBytes / 1024;

        //Double Division
        int remainingKb = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainingKb + " KB");
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return Math.PI * radius * radius;
    }

    public static double area(double width, double length) {
        if (width < 0 || length < 0) {
            return -1.0;
        }
        return width * length;
    }

    public static void printNumberInWord(int num) {
        switch(num) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }


    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }

        int aOnesPlace = a % 10;
        int bOnesPlace = b % 10;
        int aTensPlace = a / 10;
        int bTensPlace = b / 10;

        if (aOnesPlace == bOnesPlace || aOnesPlace == bTensPlace || bOnesPlace == aTensPlace || aTensPlace == bTensPlace) {
            return true;
        } else {
            return false;
        }
    }


}
