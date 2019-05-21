public class Main {
    public static void main(String[] args) {
        // Option #1 - Using Interface
        ITelephone myPhone; // Abstract Interface w/ Methods
        myPhone = new DeskPhone(1234567890); // Class that Implements w/ Methods

        // Option #2 - Using Class that Implements Interface
        DeskPhone myPhoneTwo = new DeskPhone(1234567890);
    }
}