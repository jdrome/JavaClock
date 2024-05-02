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
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    String time;
    String day;

    // MyFrame Constructor
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clocked");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);

        // Day and time formats
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");

        // Instantiate JLabel for time
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x6CFFFF)); // Light Blue
        timeLabel.setBackground(new Color(0x000)); // Black
        timeLabel.setOpaque(true); // Display background of timeLabel
        
        // Intstantiate JLabel for day
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Phosphate", Font.PLAIN,35));
        
        // Add time and day labels to our frame
        this.add(timeLabel); // add method is part of Container class, which is superclass of JFrame. Adds our timeLabel to the GUI.
        this.add(dayLabel);

        // Make visible
        this.setVisible(true);

        // Update time every second
        setTime();
    }

    public void setTime() {
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime()); // Utilizes Calendar class to get real-time data. Stores current time in "time" variable.
            timeLabel.setText(time); // Makes the "timeLabel" the current time.

            day = dayFormat.format(Calendar.getInstance().getTime()); // Utilizes Calendar class to get real-time data. Stores current time in "time" variable.
            dayLabel.setText(day); // Makes the "timeLabel" the current time.

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}