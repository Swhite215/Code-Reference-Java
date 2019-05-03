public class ConstructorChain {
    private int x;
    private int y;
    private int width;
    private int height;

    //First Constructor
    public ConstructorChain() {
        this(0,0);
    }

    //Second Constructor
    public ConstructorChain(int width, int height) {
        this(0,0,width, height);
    }

    //Third Constructor
    public ConstructorChain(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
