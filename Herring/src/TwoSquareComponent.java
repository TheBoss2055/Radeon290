import javax.swing.*;
import java.awt.*;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/1/2017.
 *
 * Program which constructs two squares to be viewed using TwoSquareViewer.
 */
public class TwoSquareComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Construct a square and draw it
        Rectangle box = new Rectangle(10, 15, 30, 30);
        g2.draw(box);

        // Construct a second square and draw it
        Rectangle box2 = new Rectangle(5, 10, 40, 40);
        g2.draw(box2);

        // Fill both squares
        g2.setColor(Color.PINK);
        g2.fill(box2);
        g2.setColor(Color.MAGENTA);
        g2.fill(box);
    }
}
