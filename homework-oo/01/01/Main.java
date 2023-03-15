import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double result = 0;
        String op;

        System.out.println("give a number");
        double num1 = sc.nextDouble();
        sc.nextLine();

                            
        System.out.println("give 2nd number");
        double num2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("give an operator");
        op = sc.nextLine();
        
        switch (op) {
            case "+":
                result = num1 + num2;
                System.out.println("result: " + result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("result: " + result);
                break;
            
            case "*":
                result = num1 * num2;
                System.out.println("result: " + result);
                break;

            case "/":
                result = num1 / num2;
                System.out.println("result: " + result);
                break;
            
            default:
                System.out.println("possibly not legal operator");
                break;
        }        
    }
}
