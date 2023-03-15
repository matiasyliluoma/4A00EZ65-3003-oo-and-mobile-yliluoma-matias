public class App {
    public static void main(String [] args) {

        Human jussi = new Human("Jussi", true, 0);
        Dog spot = new Dog("Spot", true, 0);
        Bird bird = new Bird("raven", true, 0);

        if(jussi.eats(spot)) {
            System.out.println("Success!");
            System.out.println(spot.isAlive()); // returns false
            System.out.println(jussi.getHealth());
        }

        if(jussi.eats(bird)) {
            System.out.println("Succes");
            System.out.println(bird.isAlive());
            System.out.println(jussi.getHealth());
        }

        if(jussi.eats(jussi)) {
            System.out.println("Succes");
            System.out.println(jussi.isAlive());
            System.out.println(jussi.getHealth());
        }

        if(spot.eats(jussi)) {
            System.out.println("Succes");
            System.out.println(jussi.isAlive());
            System.out.println(spot.getHealth());
        }

        if(spot.eats(spot)) {
            System.out.println("shouldnt reach this");
        }

        if(spot.eats(bird)) {
            System.out.println("succes");
            System.out.println(bird.isAlive());
            System.out.println(spot.getHealth());
        }

        if(bird.eats(jussi)) {
            System.out.println("not reaching");
        }
    }
}