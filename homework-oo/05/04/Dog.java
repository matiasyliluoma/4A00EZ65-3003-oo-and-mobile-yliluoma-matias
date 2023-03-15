public class Dog extends Mammal {
    
    public Dog(String name, boolean alive) {
        super(name, alive);
    }
    
    public void sniffButt() {
        System.out.println("sniffing other dogs butts");
    }

    public void makeSound() {
        System.out.println("wuh wuh");
    }
}
