public class Main {
    public static void main(String[] args) {
        char character = 'x';
        int amount = 4;
        
        String result = repeat1(character, amount);
        repeat2(character, amount);

    }
    public static String repeat1(char character, int amount) {
        
        String result = "";

        for(int i = 0; i < amount; i++) {
            result += character;
        }

        return result;
    }
    public static void repeat2(char character, int amount/*miksei palauteta resulttia jolla sen vois tulostaa täällä?? */) {

        String result = "";

        for(int i = 0; i < amount; i++) {
            result += character;
            
        }   
        
        System.out.println(result);

    }
}
