
public class Man extends EZImage implements FlappyElement {

    public int x;
    private int x0;
    public int y;
    public int width;
    public int height;

    public Man(String filename, int x, int y) {
        super(filename, x, y);
        this.x = x;
        x0 = x;
        this.y = y;
        this.width = getWidth();
        this.height = getHeight();
//        EZ.addElement(this);
        EZ.app.elements.add(this);
        EZ.refreshScreen();

    }

    public void update() {
        translateTo(x, y);
        if(x != x0) {
            //translateTo();
        }
    }


}
