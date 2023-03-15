
class Shape {
   public int x;
   public int y;
}

class Rectangle extends Shape {

}

abstract class Mammal {
   public void giveBirth() {
        System.out.println("Giving birth");
   }
   abstract void makeSound();
}

class Dog extends Mammal {
    void makeSound() {
        System.out.println("wuhwuh");
    }
}

interface Sellable {
    public void sell();
}

class Computer implements Sellable {
    public void sell() {
        System.out.println("pc sold");
    }
}


interface MyMouseListener {
    public void mouseEntered();
    public void mouseExited();
}

class MyWindow implements MyMouseListener {
    public void mouseEntered() {

    }

    public void mouseExited() {
        
    }
}

public class Main {

    
    public static void main(String [] args) {

   }
}