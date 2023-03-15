public class App {
    public static void main(String [] args) {

        Human jussi = new Human("Jussi", true);
        Dog spot = new Dog("Spot", true);
        Bird bird = new Bird("raven", true);

        if(jussi.eats(spot)) {
            System.out.println("Success!");
            System.out.println(spot.isAlive()); // returns false
        }

        if(jussi.eats(bird)) {
            System.out.println("Succes");
            System.out.println(bird.isAlive());
        }

        if(jussi.eats(jussi)) {
            System.out.println("Succes");
            System.out.println(jussi.isAlive());
        }

        if(spot.eats(jussi)) {
            System.out.println("Succes");
            System.out.println(jussi.isAlive());
        }

        if(spot.eats(spot)) {
            System.out.println("shouldnt reach this");
        }

        if(spot.eats(bird)) {
            System.out.println("succes");
            System.out.println(bird.isAlive());
        }

        if(bird.eats(jussi)) {
            System.out.println("not reaching");
        }
    }
}