public class Main {
    public static void main(String[] args) {
        MyWindow win2 = new MyWindow("This will be the title", 400, 400);

        // win2.setTitle();
        win2.setSize(win2.x, win2.y);
        win2.setVisible(true);

    }
}
