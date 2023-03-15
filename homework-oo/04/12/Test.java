import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
       // Point point = new Point();        
       // Pixel p = new Pixel();

        Point point2 = new Point(4,4);
        Pixel pi = new Pixel(4,4,"red");

        System.out.println(point2);
        /*
         * Now that we have Overridden toString method,
         * it outputs the values of x and y: 4, 4 in this case.
         * Without the Overriding toString it would give us
         * the hashcode of point2.
         */
    }
}
