import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();        
        Pixel a = new Pixel();
        point.x = 4;
        point.y = 10;
        //a.color = "punainen";
        //a.print();

        /*
         * Still we can not get our hands on x and y or on color 
         * because Test class is in different package, nevertheless
         * we are importing them. Now we would need get and set
         * methods to acces them.
         * Also print method wont work because it is using protected
         * attributes without getters and setters.
         */
    }
}
