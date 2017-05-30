import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Firefoxray
 */
public class RoachPopViewer
{


    public static void main(String[] args)
    {
        System.out.println("Roach population is: 2");

        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        frame.add(button);

        ActionListener listener = new RoachClickListener();
        button.addActionListener(listener);

        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
