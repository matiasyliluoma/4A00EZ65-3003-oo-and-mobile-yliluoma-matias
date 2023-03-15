import java.util.*;
public class Main {
    public static void main(String[] args) {
        //1
        String[] strings = {"saippuakauppias", "nnn", "toot", "tamaeiolepalindromi", "susus", "moro"};
        char x = 's';
        String swap = "hello";


        palindromeCheck(strings);
        chckNumbers(strings, x);
        swapchar(swap);
        
    }
//1
    public static ArrayList<String> palindromeCheck(String[] strings) {

             
        ArrayList<String> copy = new ArrayList<String>();

       

        for(int i = 0; i < strings.length; i++) {

            if(isPalindrome(strings[i])) {

                copy.add(strings[i]);
                
            }
                
        }
        
        System.out.println(copy);
        return copy;
    }

    public static boolean isPalindrome(String reverse) {

        String result = "";

        for(int i = reverse.length() - 1; i >= 0; i--) {
            result += reverse.charAt(i);
        }

        
        return result.equals(reverse);

    }
//2
    public static int chckNumbers(String[] strings, char x) {

        int counter = 0;

        for(int i = 0; i < strings.length; i++) {
            if(strings[i].charAt(0) == x) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
//3
    public static String swapchar(String swap) {

        char fchar = swap.charAt(0);
        char lchar = swap.charAt(swap.length()-1);


        String middle = swap.substring(1, swap.length()-1);

        String result = lchar + middle + fchar;
        System.out.println(result);
        return result;
    }
}

