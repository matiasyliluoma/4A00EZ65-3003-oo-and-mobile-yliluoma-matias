public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        
        int min_num = 1;
        int max_num = 50;
        int total = 0;

        //loop through myarray, make random num variable, converse math random values to int, push
        //random ints to myarray
        for(int i = 0; i < myArray.length; i++) {
            int random_num = min_num + (int)(Math.random() * ((max_num - min_num) + 1));
            System.out.println(random_num);
            myArray[i] = random_num;
        }
        //loop to count all the values
        for(int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        
        System.out.println("total: " + total);
    }    
}
