import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Project: EllichComp
 *
 * Created by Brady Herring on 5/23/17 at 11:15 AM.
 *
 * Program which constructs two separate buttons which have individual readouts.
 */
public class DualButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;

    public static void main(String[] args)
    {
        JFrame frame1 = new JFrame();
        JButton button1 = new JButton("1. Click me!");
        frame1.add(button1);

        ActionListener listener1 = new DualClickListener1();
        button1.addActionListener(listener1);

        JFrame frame2 = new JFrame();
        JButton button2 = new JButton("2. Click me!");
        frame2.add(button2);

        ActionListener listener2 = new DualClickListener2();
        button2.addActionListener(listener2);

        frame2.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);

        frame1.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
    }
}
