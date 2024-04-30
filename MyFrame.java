import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;

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