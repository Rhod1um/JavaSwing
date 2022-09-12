import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HelloActionListenerInterface {
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    HelloActionListenerInterface() {
        frame = new JFrame("HelloActionListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.add(panel = new JPanel());
        panel.add(button = new JButton("Click me!"));
        frame.setVisible(true);

        button.setText("andet text");
        button.addActionListener(new AL());
    }

    public static void main(String[] args) {
        new HelloActionListenerInterface();
    }
}

class AL implements ActionListener{ //lav seperat klasse for ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("The button was clicked"); //ActionListener gør at ting sker når knappen trykkes
        //her udskrives det her^^ i terminalen
    }
}
