import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();        
        Pixel p = new Pixel();
        

        /*
         * output:
         * Point created (default constructor)
         * Point created (default constructor)
         * Pixel created (default constructor)
         * 
         * The Point constructor call happens twice, once in
         * main method (new Point();) and once in Pixel class
         * by java's automathic super() method in constructor
         * 
         */
    }
}
