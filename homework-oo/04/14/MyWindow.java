import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;

public class MyWindow extends JFrame {
    
    public int x;
    public int y;
    private JButton clearButton;
    private JTextArea area;

    public MyWindow(String title, int x, int y) {
        super(title);
        this.x = x;
        this.y = y;

        this.clearButton = new JButton("clear");
        this.area = new JTextArea();
        setLayout(new BorderLayout());

        add(clearButton, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);

        clearButton.addActionListener(this::clearButtonClicked);
    }

    public void clearButtonClicked(ActionEvent e) {       
        area.setText("");         
    }
}