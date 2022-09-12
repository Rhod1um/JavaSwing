import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HelloActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    HelloActionListener() {
        frame = new JFrame("HelloActionListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.add(panel = new JPanel());
        panel.add(button = new JButton("Click me!"));
        frame.setVisible(true); //gør at framet vises. Skal være der. Panel er automatisk true så der skal man ikke bruge
        // setVisible. Men man kan sætte det til false for panel så den ikke vises
        // Add ActionListener here
        // Then add the ActionListener to the button

        //anonym actionListener: har ikke objektreference. Man kan lave den ikke-anonym og det gøres efter
        //samme princip som med comparator, hvor man laver et seperat objekt og bruger
        button.addActionListener(new ActionListener() { //nested klasse af ActionListener frem for at lave den uden for hovedklassen som i HelloActionListeenerInterface
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Anonymous Al clicked");
            }
        });
        panel.add(button);
        panel.validate();

    }

    public static void main(String[] args) {
        new HelloActionListener();
    }
}
