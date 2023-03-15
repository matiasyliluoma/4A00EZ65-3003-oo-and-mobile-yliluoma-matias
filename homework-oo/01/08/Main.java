import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean endGame = false;
        int lives = 7;
        

        int tooHigh = 1;
        int tooLow = -1;
        int correct = 0;

        
        int secret = secret();

        /*loop to keep the game going or end with rules, 
        if lives reach 0 you die, the if checks it after every guess.
        if you guess the correct number, you win*/
        while(!endGame) {
            if(lives == 0) {
                System.out.println("You died, game over");
                endGame = true;
                continue;
            } 
            
            System.out.println("choose a number");
            int guesses = sc.nextInt();

            int result = guess(guesses, secret, tooHigh, tooLow, correct);
            if(result == tooHigh) {
                lives--;
                System.out.println("guess was too high, " + lives + " left");
            } else if(result == tooLow) {
                lives--;
                System.out.println("guess was too low, " + lives + " left");
            } else {
                System.out.println("you won with " + lives + " left");
                endGame = true;
            }
        }
    }


    public static int secret() {

        int min_num = 1;
        int max_num = 100;

        
        int secret = min_num + (int)(Math.random() * ((max_num - min_num) + 1));

        return secret;
    }

    public static int guess(int guesses, int secret, int tooHigh, int tooLow, int correct) {

        
        if(guesses > secret) {
            return tooHigh;
        } else if(guesses < secret) {
            return tooLow;
        } else {
            return correct;
        }
    }
}
