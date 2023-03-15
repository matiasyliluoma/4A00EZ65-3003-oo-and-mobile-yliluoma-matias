import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        Pixel pixel = new Pixel();

        pixel.print(pixel.color, pixel.x, pixel.y);
        /*
         * After changing all the attributes to private
         * the print method wont work anymore since there are
         * no set and get methods for the attributes
         */
    }
}
