package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    // public Pixel() {
    //     System.out.println("Pixel created (default constructor)");
    // }
    public Pixel(int x, int y, String color) {
        super(x, y);
        /*
         * Because the attributes are private and
         * can not be accessed in any other way than this
         */
        this.color = color;
    }

    public void print() {
       // super.print(); 
        System.out.println(color);
    }
}
