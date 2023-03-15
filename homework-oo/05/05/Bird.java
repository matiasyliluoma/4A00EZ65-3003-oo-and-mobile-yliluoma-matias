public class Bird extends Animal {

    public Bird(String name, boolean alive, int i) {
        super(name, alive, i);
    }
    
    public void fly() {
        System.out.println("flying");
    }
}
