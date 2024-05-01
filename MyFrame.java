import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import java.awt.Color;

public class MyFrame extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;

    // MyFrame Constructor
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clocked");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        timeLabel = new JLabel();
        time = timeFormat.format(Calendar.getInstance().getTime()); // Utilizes Calendar class to get real-time data. Stores current time in "time" variable.
        timeLabel.setText(time); // Makes the "timeLabel" the current time.
        timeLabel.setFont(new Font("Verdana", Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x6CFFFF)); // Light Blue
        timeLabel.setBackground(new Color(0x000)); // Black
        timeLabel.setOpaque(true); // Display background of timeLabel
        this.add(timeLabel); // add method is part of Container class, which is superclass of JFrame. Adds our timeLabel to the GUI.
        this.setVisible(true);

        setTime();
    }

    public void setTime() {
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime()); // Utilizes Calendar class to get real-time data. Stores current time in "time" variable.
            timeLabel.setText(time); // Makes the "timeLabel" the current time.
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}