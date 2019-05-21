public class MobilePhone implements ITelephone, IAnotherInterface {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered on.");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Dialing: " + phoneNumber);
        } else {
            System.out.println("Phone is switched off.");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ring ring...");
        } else {
            isRinging = false;
            System.out.println("Number wrong or phone is not on.");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}