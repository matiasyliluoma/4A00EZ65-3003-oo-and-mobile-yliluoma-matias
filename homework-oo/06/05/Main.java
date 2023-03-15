
class Shape {
   public int x;
   public int y;
}



abstract class Mammal {
   public void giveBirth() {
        System.out.println("Giving birth");
   }
   abstract void makeSound();
}


interface Sellable {
    public void sell();
}



interface MyMouseListener {
    public void mouseEntered();
    public void mouseExited();
}


public class Main {

    private static int z = 5;
    public static void main(String [] args) {

        int b = 12;
        class Rectangle extends Shape {
            
        }

        /*
         * when variables are shown either in method or in class
         * the classes which are defined in method can acces
         * them. in this case y is static because main method is static
         * also.
         */
        class Dog extends Mammal {
            void makeSound() {
                System.out.println(z + b + " wuhwuh");
            }
        }

        class Computer implements Sellable {
            public void sell() {
                System.out.println("pc sold " + z + " times");
            }
        }

        class MyWindow implements MyMouseListener {
            public void mouseEntered() {
                System.out.println("mouse entered " + z + " times");
            }
            public void mouseExited() {
                System.out.println("mouse exited " + z + " times");
            }
        }

        // shape can contain rectangle or shape
        Shape shape = new Rectangle();
        Shape shape2 = new Shape();
        // mammal can contain Dog, not itself because its abstract
        Mammal mammal = new Dog();
        mammal.makeSound();
        // sellable can contain computer or every other class which implements sellable
        Sellable sellable = new Computer();
        sellable.sell();
        // my mouselistener can contain mywindow or every other class which implements mouselistener
        MyMouseListener myMouseListener = new MyWindow();
        myMouseListener.mouseEntered();
        myMouseListener.mouseExited();

        Shape shape1 = new Shape() {
            
        };

        Mammal mammal1 = new Mammal() {
            void makeSound() {
                System.out.println(z + b + "wuhwuh");
            }
        };

        mammal1.makeSound();

        Sellable s = new Sellable() {
            public void sell() {
                System.out.println("pc sold " + z + " times");
            }
        };

        s.sell();

        MyMouseListener m = new MyMouseListener() {
            public void mouseEntered() {
                System.out.println("mouse entered " + z + " times");
            }
            public void mouseExited() {
                System.out.println("mouse exited " + z + " times");
            }
        };

        m.mouseEntered();
        m.mouseExited();
   }
}