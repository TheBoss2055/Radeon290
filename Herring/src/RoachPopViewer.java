import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Project: EllichComp
 *
 * Created by Brady Herring on 5/23/17 at 11:03 AM.
 *
 * Program which allows you to view and click a button to modify the roach population.
 */
public class RoachPopViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;

    public static void main(String[] args)
    {
        System.out.println("Roach population is: 2");

        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        frame.add(button);

        ActionListener listener = new RoachClickListener();
        button.addActionListener(listener);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
