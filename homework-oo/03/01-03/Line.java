public class Line {
        
    private Point startingPoint;
    private Point endingPoint;
    
    public Line(int x1, int y1, int x2, int y2) {
        this.startingPoint = new Point(x1, y1);
        this.endingPoint = new Point(x2, y2);
    }

    public void setStartingPoint(Point startingPoint) {
        this.startingPoint = new Point(startingPoint.getX(), startingPoint.getY());
        
    }

    public void setEndingPoint(Point endingPoint) {
        this.endingPoint = new Point(endingPoint.getX(), endingPoint.getY());
    }

    public void setStartingPoint(int x, int y) {
        this.startingPoint.setX(x);
        this.startingPoint.setY(y);
    }

    public void setEndingPoint(int x, int y) {
        this.endingPoint.setX(x);
        this.endingPoint.setY(y);
    }

    public Point getStartingPoint() {
        return this.startingPoint;
    }

    public Point getEndingPoint() {
        return this.endingPoint;
    }

    public int getStartingPointX() {
        return startingPoint.getX();
    }

    public int getStartingPointY() {
        return startingPoint.getY();
    }

    public int getEndingPointX() {
        return endingPoint.getX(); 
    }

    public int getEndingPointY() {
        return endingPoint.getY();
    }

    public String toString() {

        return "[x = " + startingPoint.getX() + ", y = " + startingPoint.getY() + "], " + "[x = " + endingPoint.getX() + ", y = " + endingPoint.getY() + "]";
    }
    
    public boolean equals(Line line2) {
        return this.startingPoint.getX() == line2.startingPoint.getX() && 
                this.startingPoint.getY() == line2.startingPoint.getY() && 
                    this.endingPoint.getX() ==  line2.endingPoint.getX() && 
                        this.endingPoint.getY() ==  line2.endingPoint.getY();
    }
}
