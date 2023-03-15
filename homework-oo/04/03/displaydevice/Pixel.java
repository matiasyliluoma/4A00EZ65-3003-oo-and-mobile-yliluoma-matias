package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    public void print(String color, int x, int y) {
        System.out.println(color + " " + x + " " + y);
    }
}
