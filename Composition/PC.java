public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //Getter methods for composition classes
    private Case getCase() {
        return this.theCase;
    }
    
    public Monitor getMonitor() {
        return this.monitor;
    }

    //Example of further limiting composition
    public Motherboard getMotherboard() {
        return this.motherboard
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        this.getMonitor().drawPixelAt(1200, 50, "yellow"); //Option #1
        monitor.drawPixelAt(1200, 5, "yellow"); //Option #2
    }


}