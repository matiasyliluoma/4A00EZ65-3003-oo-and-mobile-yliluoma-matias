public class PizzaBox<T> {
    public T pizza;
    public PizzaBox(T pizza) {
        this.pizza = pizza;
    }
    

    @Override
    public String toString() {
        return "PizzaBox containing " + pizza.toString();
    }
}
