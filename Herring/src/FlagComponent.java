import javax.swing.*;
import java.awt.*;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/12/2017.
 *
 * Program which constructs a flag to be viewed using FlagViewer.
 */
public class FlagComponent extends JComponent{

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(5, 10, 20, 30);

        g.setColor(Color.GREEN);
        g.fillRect(0, 10, 50, 100);

        g.setColor(Color.WHITE);

        g.fillRect(50, 10, 50, 100);

        g.setColor(Color.RED);
        g.fillRect(100, 10, 50, 100);

    }
}

