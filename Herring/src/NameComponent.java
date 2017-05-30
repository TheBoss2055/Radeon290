import javax.swing.*;
import java.awt.*;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/10/2017.
 *
 * Program which constructs a name to be viewed using NameViewer.
 */
public class NameComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(20, 30, 100, 70);
        g.setColor(Color.BLUE);
        g2.draw(box);
        g.setColor(Color.RED);
        g.drawString("Brady", 50, 70);
    }
}
