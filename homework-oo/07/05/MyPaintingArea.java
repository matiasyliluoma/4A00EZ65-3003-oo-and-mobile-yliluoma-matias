import javax.swing.*;

public class MyPaintingArea extends JPanel {
    

    public MyPaintingArea() {
        Graphics g = new Graphics();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // use g to draw stuff
    }
}
