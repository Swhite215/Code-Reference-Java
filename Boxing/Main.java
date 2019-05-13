import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        // Without Autoboxing - Primiitve Types
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // Autoboxing - Long Way
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            // Integer.valueOf returns i as primitive type
            intArrayList.add(Integer.valueOf(i)); // Autoboxing - Convert Primitive to Object Wrapper
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); // Unboxing - Convert Object Wrapper to
                                                                              // Primitive
        }

        // Autoboxing - Short
        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();

        Double myDoubleValue = 12.25;
    }
}