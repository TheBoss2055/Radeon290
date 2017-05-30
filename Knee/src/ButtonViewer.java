import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created and Edited By Ray Anthony Barrett Jr.
 * ABOUT TO COMMIT
 */
public class ButtonViewer
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        frame.add(button);

        ActionListener listener = new ClickListener();
        button.addActionListener(listener);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
