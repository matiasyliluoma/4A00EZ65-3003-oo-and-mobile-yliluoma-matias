@FunctionalInterface
interface Flyable {
    public void fly(int speed);
}
class App {
    public static void main(String [] args) {
        class Bird implements Flyable {

            @Override
            public void fly(int speed) {
                if(speed == -20) {
                    System.out.println("flying backwards");
                } else {
                    System.out.println("flying forwards");
                }
                
            }
            
            
        }
        Bird b = new Bird();

        flyMe(b);

        class Airplane implements Flyable {
            @Override
            public void fly(int speed) {
                System.out.println(speed);
            }
        }

        Airplane p = new Airplane();

        flyMe(p);

        flyMe(new Flyable() {
           public void fly(int speed) {
                System.out.println(speed);
           } 
        });

        flyMe(System.out::println);
    }

    public static void flyMe(Flyable a) {
        a.fly(20);
        a.fly(-20);
    }
}