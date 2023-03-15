public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
        setX(x);
        setY(y);
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

    public boolean equals(Point startingPoint, Point endingPoint) {
        return startingPoint.x == this.x && 
                startingPoint.y == this.y && 
                    endingPoint.x == this.x && 
                        endingPoint.y == this.y;
    }

    
    public String toString() {
        
        return "hei " + x + y;
    }
}
