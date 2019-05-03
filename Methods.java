public class Methods {
    public static void main(String[] args) {
        sum(1, 2);
        difference(1,2);
        quotient(1,2);
        product(1,2);


        //Parsing Int Values from String
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);

        //Parsing Double Values from String
        String numberAsStringTwo = "2018.125";
        System.out.println("numberAsStringTwo = " + numberAsStringTwo);

        double numberTwo = Double.parseDouble(numberAsStringTwo);
        
    }

    //Static Operator Methods
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    //Instance Methods - Requires Instantiation
    public String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return "Number is " + num;
        }
    }

    //Overloading Methods - Initial Declaration
    public int overloadMethod(int a, int b) {
        return a + b;
    }

    //Overloading Methods - Reduced Parameters
    public int overloadMethod(int a) {
        return a;
    }

    //Overloading Methods - No Parameters
    public String overloadMethod() {
        return "Nothign to do.";
    }


}
