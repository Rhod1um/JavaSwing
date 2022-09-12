import javax.swing.*;

public class HelloWorldNotRefactored {
    private JFrame frame;
    private JLabel label;

    HelloWorldNotRefactored(){
        frame = new JFrame("HelloWorldRefactored");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label = new JLabel("The label"));
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //frame.validate();
        //frame.repaint();
    }

    public static void main(String[] args) {
        new HelloWorldNotRefactored().run();
        // 1. Move JFrame and JLabel to attributes right under class declaration

        // 2. Move this segment to construtor:

        // 3. Move this segment to run() method
    }

    void run(){
        try {
            Thread.sleep(1000);
        } catch (Exception e) { } //tom body. sleep kaster en exception som skal med her men bruges ikke
        label.setText("Label's new text");
    }
    // 4. Finally, let main() method create an instance of class and call run() method
}

