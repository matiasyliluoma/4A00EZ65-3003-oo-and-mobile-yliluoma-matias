package coordinate;

public class Point {    
    private int x;
    private int y;
    
    // public Point() {
    //     System.out.println("Point created (default constructor)");
    // }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Point created (parameter constructor)");
    }
    public void print() {
        System.out.println(x);
        System.out.println(y);
    }
}
