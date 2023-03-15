@FunctionalInterface // only useable if there is only one method in the interface
interface Flyable {
    public void fly();
}
class App {
    public static void main(String [] args) {
        flyMe(() -> System.out.println("lambda lintu lentää"));
    }

    public static void flyMe(Flyable a) {
        a.fly();
    }
}