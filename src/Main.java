import javax.swing.*;
import java.awt.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Main { //klassen kan extende JFrame men det er dårlig stil. (nogle gange kan det give mening)
    // Lav i stedet klasse og lav JFrame attribute, private JFrame frame;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, world");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //center på skærm
        frame.setVisible(true);
        frame.pack();
        JPanel panel = new JPanel();
        frame.setLayout(new FlowLayout());
        frame.add(panel);
        panel.setBackground(Color.BLUE);
        JLabel centerLabel = new JLabel("should be centered in the middle");
        JLabel underLabel = new JLabel("should be under first label");
        centerLabel.setVisible(true);
        panel.add(centerLabel);
        panel.add(underLabel);

        /*
        panel.add(label);
        panel.add(label2); //kan ikke have to labels?
        panel.setBackground(Color.BLUE);
        frame.add(label, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null); //center på skærm
        frame.pack();
        frame.setVisible(true);
        //pack() gør at vinduet passer til komponenterne
        */
        //Menu

    }
}
