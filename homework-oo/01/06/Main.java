import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("give a string");
        String x = sc.nextLine();

        String[] mStrings = {"moro", "tere", "moro", "moro", "tsau"};
        String y = "moro";

        int[][] myArray = { {1, 2, 3}, {4, 5, 6} };

        remove(x);
        check(mStrings, y);
        multiArray(myArray);

        sc.close();        
    }
    
//1
    public static String remove(String x) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        String result = "";

        for(int i = 0; i < x.length(); i++) {
            boolean isVowel = false;
            for(int j = 0; j < vowels.length; j++) {
                if(x.charAt(i) == vowels[j]) {
                    isVowel = true;
                }
            }
            if(isVowel != true) {
                result += x.charAt(i);
            }
        }

        System.out.println("result: " + result);
        return result;
    }


//2
    public static int check(String[] mStrings, String y) {


        int counter = 0;
        boolean isMatch = false;
        
        for(int i = 0; i < mStrings.length; i++) {
            
            if(y.equals(mStrings[i])) {
                isMatch = true;
                counter++;
            }
        }
        if(isMatch == false) {
            System.out.println("not found");
        }        
        System.out.println(counter);
        return counter;
    }
//3
    public static int[] multiArray(int[][] myArray) {

        int length1 = myArray.length;
        int[] result = new int[length1];

        for(int i = 0; i < length1; i++) {
            int sum = 0;
            for(int j = 0; j < myArray[i].length; j++) {
                sum += myArray[i][j];
            }
            result[i] = sum;
            
            System.out.println(result[i]);
        }
        return result;
    }
}
