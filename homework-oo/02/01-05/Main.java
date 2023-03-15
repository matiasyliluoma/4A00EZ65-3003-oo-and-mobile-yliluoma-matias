
public class Main {
    public static void main(String[] args) {
        
        //Part of t1, t2, t3

        Point p = new Point();
        Point origo1 = new Point();
        Point origo2 = origo1;

        //  teht1 
        //  origo1.x = 1;
        //  origo1.y = 2;  
        //  origo2 values are 1 and 2 because origo2 = origo1;                
        //  System.out.println(origo2.x + " " + origo2.y);
        //  System.out.println(p.x + p.y);
        /*
         * The aboves are commented out because the attributes aren't
         * public anymore
         */
        // teht1 output
        System.out.println(p.getX() + p.getY()); 
        System.out.println(origo2.getX() + " " + origo2.getY());
        /* Point class got int x and y which are 
        0, x + y = 0, or 00 if x + "" + y = 00*/

        origo1.printMe();
        System.out.println(origo1);
        /*
        What do you get and why: 
        Its the hashcode of the object.
        You get only the hashcode because it is not on toString
        What object:
        It's the object of origo1 and origo2
        End of t1
        */
        
        
        
        /* 
        teht 2

        Because there is no setters and getters generated yet,
        private attributes can not be reached without setters and getters
        */


        //teht 3
        origo1.setX(1);
        origo1.setY(2);
        origo1.setZ(2); 
    /*  Will use set and getters, because everything 
        else is on sets and gets. Also if some changes need to be done,
        there will be less hassle changing in code
    */
        //teht 4
        Point p1 = new Point(1,2,3);
        Point p2 = new Point(1, 2);/* 
        It fails, because there are no values for constructor, in this
        case it must be ints*/
        Point p3 = new Point();


        //teht 5
        System.out.println(p1.equals(p2)); //equals() compares strings and the values are ints, not strings
        // System.out.println(p1.toString()); //sysout already calls toString, so this actually makes double toString call and thus it outputs the hashcode of the object
        // System.out.println(p1);


        String moi = p1.toString();
        String moi2 = p2.toString();

        System.out.println(moi);
        System.out.println(moi2);

        System.out.println(moi.equals(moi2));
        /*
         * Now that Point class has toString method,
         * we can finally print something else than just the hashcodes
         * and we can compare if the objects have similar values or not.
         */
    }
}
