package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    public void print() {
        super.print(); // now it works because we are calling
        // the constructor of the point class and print method is public
        // because print() method is in base class Point, and Point
        // has acces to the private ints x and y.
        System.out.println(color);
        // System.out.println(x);
        // System.out.println(y); we dont have acces cause they are
        // private variables
    }
}
