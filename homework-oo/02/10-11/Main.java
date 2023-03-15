public class Main {
    public static void main(String[] args) {

        PizzaBox<Pepperoni> pb1 = new PizzaBox<Pepperoni>(new Pepperoni());
        PizzaBox<Tropicana> pb2 = new PizzaBox<Tropicana>(new Tropicana());
        PizzaBox<String> pb3 = new PizzaBox<String>("Perfetta");
        PizzaBox<Integer> pb4 = new PizzaBox<Integer>(4); //None if you use Integer object like this and you have the toString method Overridden which returns all as a string.
        //Otherwise getters and setters should be used.
        System.out.println(pb1); // outputs PizzaBox containing Pepperoni
        System.out.println(pb2); // outputs PizzaBox containing Tropicana
        System.out.println(pb3); // outputs PizzaBox containing Perfetta
        System.out.println(pb4);
    }
}
