import javax.swing.*;
import java.awt.*;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/12/2017.
 *
 * Program which constructs a Checkerboard to be viewed using CheckerboardViewer.
 */
public class CheckerboardComponent extends JComponent
{

    public int xpos = 0;
    public int ypos = 0;

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle (0, 0, 5, 5);

        for (int m = 0; m < 8; m++)
        {
            g.setColor(Color.RED);
            g.fillRect(0, ypos, 400, 50);

            if (ypos % 100 == 0)
            {
                xpos = xpos - 50;
            }

            for (int i = 0; i < 8; i++)
            {
                xpos = xpos + 50;

                if (i % 2 == 0)
                {
                    g.setColor(Color.BLACK);
                    g.fillRect(xpos, ypos, 50, 50);
                }
            }

            ypos = ypos + 50;
            xpos = 0;
                }
            }
}


