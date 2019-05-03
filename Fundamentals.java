public class Fundamentals {

    public static void main(String[] args) {

        //Variables
        int myAge = 26;
        String firstName = "Spencer";
        boolean engaged = true;
        double height = 5.11;

        //Primitive Types
        int myMinValue = -2_147_483_648; // 4 Bytes
        int myMaxValue = 2_147_483_647;

        byte myMinByteValue = -127; //Quarter of an Int, 1 Byte
        byte myMaxByteValue = 127;

        short myMinShort = -32768; //Half an Int, 2 Bytes
        short myMaxShort = 32767;

        long myMaxLongValue = 2^63L; //Double an Int, 8 Bytes
        long myMinLongValue = -2^63L;

        float myFloat = 5.2F; //Seven Digits of Precision, 4 Bytes

        double myDouble = 5.25D;; //Sixteen Digits of Precision, 8 Bytes

        char myChar = 'S'; //Half an Int, 2 Bytes
        char myUnicodeChar = '\u00A9';

        boolean myTrueBool = true;
        boolean myFalseBool = false;
        boolean invertBool = !true;

        //Casting
        byte castByte = (byte)(myMaxByteValue / 2);
        short castShort = (short)(myMaxShort / 2);
        float castFloat = (float)(myFloat / 1.2);

        //Operators
        int sum = myAge + 1;
        int difference = myAge - 1;
        int product = myAge * 2;
        int quotient = (int)(myAge / height);
        int modulus = myAge % 2;
        int postIncrement = myAge++;
        int preIncrement = ++myAge;
        int postDecrement = myAge--;
        int preDecrement = --myAge;
        boolean equalTo = myAge == 26;
        boolean notEqualTo = myAge != 23;
        boolean greaterThan = myAge > 20;
        boolean greaterThanOrEqual = myAge >= 20;
        boolean lessThan = myAge < 30;
        boolean LessThanOrEqual = myAge <= 30;
        boolean conditionalAnd = myTrueBool && myFalseBool;
        boolean conditionalOr = myTrueBool || myFalseBool;
        boolean ternary = myTrueBool ? true : false;
        int assignment = 1;
        assignment += 2;
        assignment -= 2;
        assignment *= 2;
        assignment /= 2;
        assignment %= 2;

        System.out.println("Fundamentals, " + firstName + "!");

    }

}
