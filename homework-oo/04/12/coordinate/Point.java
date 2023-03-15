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

    @Override // compiles because toString is method of Object:
    // https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
    // and we are overriding that method, when Point class
    // actually extends the Object class.
    public String toString() {
        return this.x + " " + this.y;
    }
}
