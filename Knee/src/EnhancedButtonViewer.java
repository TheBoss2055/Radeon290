import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * AM to the PM PM to the AM Funk
 */
public class EnhancedButtonViewer
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        frame.add(button);
        ActionListener listener = new EnhancedClickListener();
        button.addActionListener(listener);
        frame.setTitle("Button Viewer");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //
        JFrame frame2 = new JFrame();
        JButton button2 = new JButton("Click me!");
        frame2.add(button2);
        frame2.setTitle("Button Viewer");
        frame2.setSize(200, 200);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        ActionListener listener2 = new EnhancedClickListener();
        button2.addActionListener(listener2);
    }
}
