import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        char c;
        boolean found = false;

        System.out.println("give a string");
        str = sc.nextLine();
        

        System.out.println("give a character");
        c = sc.next().charAt(0);


        for(int i = 0; i < str.length(); i++) {                        
            if(c == str.charAt(i)) {                
                System.out.println("first char is " + c + " and the index is " + i);
                found = true;   
                break;
            }                    
        }
        
        if(found == false) {
            System.out.println("char not found from string");
        }                    
    }    
}

