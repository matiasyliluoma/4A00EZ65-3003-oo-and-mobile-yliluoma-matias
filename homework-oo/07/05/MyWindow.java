import javax.swing.JFrame;

public class MyWindow extends JFrame {
    
    public MyWindow() {
        // add painting area
        add(new MyPaintingArea());
    }
}
