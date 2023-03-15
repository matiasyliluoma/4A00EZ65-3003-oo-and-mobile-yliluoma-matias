public class MyRunnable implements Runnable {
    private int num;

    public MyRunnable(int num) {
        this.num = num;
    }
    

    @Override
    public void run() {
        for(int i = 1; i <= num; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {                
                e.printStackTrace();
            }
        }
    }

    public void argsIterator(String[] args) {
        
        for(int i = 0; i < args.length; i++) {
            num = Integer.parseInt(args[i]);
           createThread(num);
        //    Thread thread = new Thread(new MyRunnable(num));
        //    thread.start();
        }        
    }

    public void createThread(int num) {
        Thread thread = new Thread(new MyRunnable(num));
        thread.start();
    }
}
