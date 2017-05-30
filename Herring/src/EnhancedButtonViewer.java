import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Project: EllichComp
 *
 * Created by Brady Herring on 5/23/17 at 10:51 AM.
 *
 * This enhanced program demonstrates how to install an action listener.
 */
public class EnhancedButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        frame.add(button);

        ActionListener listener = new EnhancedClickListener();
        button.addActionListener(listener);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
