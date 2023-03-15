package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    public Pixel() {
        System.out.println("Pixel created (default constructor)");
    }
    public Pixel(int x, int y, String color) {
        super(x, y);
       
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    public void print() { 
       // super.print(); 
        System.out.println(color);
    }
}
