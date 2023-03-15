public class Point {
    //public int x;
    //public int y;

    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
//t4 fixed by making new constructors with the wanted attributes
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
//t4
    public Point() {

    }
    public void setX(int x) {
        if(x < 0) {         
            throw new IllegalArgumentException();
        } else {               
            this.x = x;
        }
    }

    public void setY(int y) {
        if(y < 0) {
            throw new IllegalArgumentException();
        } else {
            this.y = y;
        }
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void printMe() {

    }
//t5
    
/*If this is commented all the 
 * prints of the objects print only
 * the hashcode of the object
 */
    public String toString() {
        return "x = " + x + " x = " + y + " z = " + z;
    }
}
