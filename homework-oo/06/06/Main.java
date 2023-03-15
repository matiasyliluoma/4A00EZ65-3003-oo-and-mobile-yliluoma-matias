

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


class Main {
   public static void main(String [] args) {
      int z = 5;
      Shape s = new Shape() {
        
      };

      Sellable x = new Sellable() {
         public void sell() {
            System.out.println("sold " + z + " pcs");
         }
      };

      Mammal m = new Mammal() {
         void makeSound() {
            System.out.println("wuh");
         }
      };

      MyMouseListener mouse = new MyMouseListener() {
         public void mouseEntered() {
            System.out.println("entered");
         }

         public void mouseExited() {
            System.out.println("exited");
         }
         
      };
      m1(s);  
      m2(m);
      m3(x);
      m4(mouse);
   }
   public static void m1(Shape obj) {
      // what methods / atttributes I can use from obj?
     
      System.out.println(obj.x + obj.y);
   }
   public static void m2(Mammal obj) {
      // what methods / atttributes I can use from obj?  
      obj.makeSound();
      obj.giveBirth();
   }
   public static void m3(Sellable obj) {
      // what methods / atttributes I can use from obj?
      obj.sell();
   }
   public static void m4(MyMouseListener obj) {
      // what methods / atttributes I can use from obj?  
      obj.mouseEntered();
      obj.mouseExited();
   }
}