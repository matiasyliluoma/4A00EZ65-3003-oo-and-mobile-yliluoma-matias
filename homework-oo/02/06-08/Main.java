import java.awt.Color;
import java.util.*;
public class Main {
    public static void main(String [] args) {
        Color c = new Color(255, 0, 0, 128);        
        //Color parameter outside of range if its over 255
        c.toString();
        System.out.println(c.toString()); //Prints the object as a string

        Color c1 = c.darker(); // lowers / makes it more darker it from 255 to 178
        System.out.println(c1);

        Color c2 = c.brighter();
        System.out.println(c2); // back to 255

        System.out.println(c1.equals(c2)); //checks if the values of the objects are the same, in this case it returns false

        /*
         * Differences between array and ArrayList:
         * ArrayList is class, array is a non-primitive datatype to store
         * multiple values of the same datatype.
         * Array has fixed size, whereas ArrayList can grow and decrease in size.
         * ArrayList provides methods for growing and decreasing, such as add() and remove
         * for example. Arrays don"t have such tools.
         */
        
        LinkedList<String> cities = new LinkedList<String>();

        cities.add("helsinki");
        cities.add("rome");
        cities.add("new york");
        cities.add("cincinnati");
        cities.add("jkl");

        /*
         * the built in methods differs a lot.
         * For example getting and manipulating data with LinkedList
         * is really easy. LinkedList dont really make any arrays.
         */
        
        cities.addFirst("Tampere"); //adds this as first element to the list
        cities.addLast("Detroit");//adds this as last element to the list
        System.out.println(cities.getFirst()); //gets first element
        System.out.println(cities.getLast()); //gets last
        //cities.clear();
        for(int i = 0; i < cities.size(); i++) {
            
            System.out.println(cities.get(i));
        }
        
        HashSet<String> set = new HashSet<String>();

        //here we have some most common names finland may have
        set.add("Ville Mäkelä");
        set.add("Tiina Järvinen");
        set.add("Ville Mäkelä");
        set.add("Joe Biden");

        System.out.println(set); //output is [Tiina JÃ¤rvinen, Ville MÃ¤kelÃ¤], because no duplicates are allowed
        //HashSet can take only unique values,
        //which certainly minimizes the options of its usage.

        TreeSet<Integer> set2 = new TreeSet<Integer>();

        //TreeSet is great for sorting your set and have also
        //built in methods for example printing out in
        //ascending or descending order
        //Like hashset, takes only unique values

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println(set2); //[1, 2, 3, 4, 5, 6]
        System.out.println(set2.descendingSet()); //[6, 5, 4, 3, 2, 1]

        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        //has "key" and its value so takes in more than value without
        //having the need to make it as

        hmap.put("Joe Biden", 88); //differs in a way that its put method
        //instead of add

        System.out.println(hmap.keySet()); //returns the key value
        
        ArrayList<Integer> rgbArrayList = new ArrayList<Integer>();
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Give color values (answer exit if you want to quit)");
        
        while(true) {
            try {
                            
                String[] rgbValues = sc.nextLine().split(",");

                if(!rgbValues[0].equals("exit")) {
                        
                                        
                    for(String s : rgbValues) {
                        try {
                            
                        
                            int result = Integer.parseInt(s);
                            //String[] ch = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","w","v","x","z"};
                            
                            
                            if(rgbValues.length != 3) {
                                throw new Exception("Please have 3 numbers separated by comma");
                            }

                            if(result >= 0 && result < 256) {                            
                                rgbArrayList.add(Integer.parseInt(s));
                            } else {
                                System.out.println("numbers between 0 and 255");
                                continue;
                            }
                        } catch (NumberFormatException e) {
                            if(!s.equals("exit")) {
                                System.out.println("Please ints only");
                                continue;
                            }
                        }           
                    }
                } else if (rgbValues[0].equals("exit")) {
                    for(int i = 0; i < rgbArrayList.size(); i+=3) {
                        Color color = new Color(rgbArrayList.get(i), rgbArrayList.get(i+1), rgbArrayList.get(i+2));
                        System.out.println(color.toString());
                    }           
                    break;
                } else {
                    System.out.println("good bye");
                    break;
                }
            } catch (Exception e) {
                e.getMessage();
                break;
            }              
        }           
    }               
}

