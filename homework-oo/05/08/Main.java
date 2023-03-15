public class Main {
    public static void main(String [] args) {
        SoftDrink cocacola = new SoftDrink();        
        Dog dog = new Dog();
        Bird bird = new Bird();

        Store store = new Store("super-market");

        store.addSellableItem(bird);
        store.addSellableItem(dog);
        store.addSellableItem(cocacola);

        System.out.println("Item 1 " + store.getSellableItem(0));                
        System.out.println("Item 2 " + store.getSellableItem(1));
        System.out.println("Item 3 " + store.getSellableItem(2)); 

        store.removeSellableItem(bird);

        // now index 0 is dog because bird got sold
        System.out.println(store.getSellableItem(0));

        // now all items got sold and trying to getsellabletimes will return out of bond
        store.sellAllItems();

        System.out.println("all items been sold");
    }
}
