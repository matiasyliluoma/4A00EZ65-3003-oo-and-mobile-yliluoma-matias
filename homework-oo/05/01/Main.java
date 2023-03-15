public class Main {
    public static void main(String [] args) {
        // Mammal m = new Mammal(); fails because you can not 
        // create objects from abstract class

        Dog musti = new Dog("musti");

        musti.giveBirthToLiving();
        System.out.println(musti.getName());
    }
}