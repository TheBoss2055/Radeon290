import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/11/2017.
 *
 * Program which constructs a traffic signal to be viewed using TrafficLightViewer.
 */
public class TrafficLightComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(20, 30, 50, 100);
        g2.fill(box);
        Ellipse2D.Double circle = new Ellipse2D.Double(35, 40, 20, 20);
        g2.setColor(Color.RED);
        g2.draw(circle);
        g2.fill(circle);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(35, 70, 20, 20);
        g2.setColor(Color.YELLOW);
        g2.draw(circle2);
        g2.fill(circle2);
        Ellipse2D.Double circle3 = new Ellipse2D.Double(35, 100, 20, 20);
        g2.setColor(Color.GREEN);
        g2.draw(circle3);
        g2.fill(circle3);
    }
}
