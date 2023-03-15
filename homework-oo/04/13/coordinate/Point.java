package coordinate;

public class Point {    
    private int x;
    private int y;
    
    public Point() {
        System.out.println("Point created (default constructor)");
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Point created (parameter constructor)");
    }
    public void print() {
        System.out.println(x);
        System.out.println(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}
