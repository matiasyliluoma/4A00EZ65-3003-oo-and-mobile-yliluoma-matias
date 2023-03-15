public class Main {
    public static void main(String [] args) {
        // Mammal m = new Mammal(); fails because you can not 
        // create objects from abstract class

        Dog musti = new Dog("musti");
        Human masa = new Human("pena");
        Bird b = new Bird("raven");

        musti.giveBirthToLiving();
        System.out.println(musti.getName());
        masa.createArt();
        musti.sniffButt();
        b.fly();
        musti.makeSound();
        masa.makeSound();
    }
}