public class Main {
    public static void main(String [] args) {
        MyRunnable r = new MyRunnable();
        Thread thread1 = new Thread(r);        
        thread1.start();
        Thread thread2 = new Thread(r);
        thread2.start();
    }
}