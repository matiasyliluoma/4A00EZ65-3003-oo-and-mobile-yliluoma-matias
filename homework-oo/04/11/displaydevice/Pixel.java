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
    @Override
    public void printTypo() { //it doesnt compile, since we are trying 
        //to override something that doesnt exist
       // super.print(); 
        System.out.println(color);
    }
}
