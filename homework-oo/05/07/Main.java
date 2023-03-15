public class Main {
    public static void main(String [] args) {
        SoftDrink cocacola = new SoftDrink();        
        Dog dog = new Dog();
        Bird bird = new Bird();

        cocacola.sell();
        dog.sell();
        bird.sell();

        
        
        method(cocacola);
        method(dog);
        method(bird);
        
    }

    public static void method(SellableItem a) {

    }
}
