public class Main {
    public static void main(String[] args) {
        Line line = new Line(5,5,10,10);
        Line line2 = new Line(5,5,10,10);
        System.out.println(line);
        System.out.println(line2);
        System.out.println(line.equals(line2));


        Line line1 = new Line(5,5,10,10);
        Point a = new Point(0,0);
        line1.setStartingPoint(a);
        a.setX(1);
        System.out.println(line1);
        /*
         * Line changes but it would be good if it didn't. Changing values of object like this is 
         * not good practise 
         * 
         */
    }
}
