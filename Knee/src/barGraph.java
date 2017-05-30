import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

/**
 * Created by TheBo on 5/12/2017.
 */

public class barGraph extends JComponent
{

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(10, 10, 750, 400);
        g2.draw(box);

        g.setColor(Color.yellow);
        g.fillRect(10, 10, 440, 100);

        g.setColor(Color.red);
        g.fillRect(10, 110, 120, 100);

        g.setColor(Color.blue);
        g.fillRect(10, 210, 190, 100);

        g2.setColor(Color.green);
        g.fillRect(10, 310, 400, 100);

        g.setColor(Color.black);
        g.drawString("Golden Gate", 50, 60);
        g.drawString("Brooklyn", 50, 160);
        g.drawString("Delaware Memorial", 50, 260);
        g.drawString("Mackinac", 50, 360);
        g2.draw(box);

        g.drawString("500", 10, 430);
        g.drawString("1000", 60, 430);
        g.drawString("1500", 120, 430);
        g.drawString("2000", 180, 430);
        g.drawString("2500", 240, 430);
        g.drawString("3000", 300, 430);
        g.drawString("3500", 360, 430);
        g.drawString("4000", 420, 430);
        g.drawString("4500", 480, 430);
        g.drawString("5000", 540, 430);

    }
}