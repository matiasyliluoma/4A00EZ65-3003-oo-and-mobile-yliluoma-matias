import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
       // Point point = new Point();        
       // Pixel p = new Pixel();
        // there are no more constructor without arguements,
        // default is without arguements and when you
        // make new constructor with arguements for example
        // the default one without arguements gets deleted/overridden/overloaded
        Point point2 = new Point(4,4);
        Pixel pi = new Pixel(4,4,"red");
    }
}
