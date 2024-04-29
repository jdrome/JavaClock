import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {
    // MyFrame Constructor
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clocked");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);
        this.setVisible(true);
    }
}