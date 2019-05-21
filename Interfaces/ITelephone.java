public interface ITelephone {
    // Methods a Class Using ITelephone Needs to Implement
    public void powerOn();

    public void dial(int phoneNumber);

    public void answer();

    public boolean callPhone(int phoneNumber);

    public boolean isRinging();
}