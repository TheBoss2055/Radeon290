import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class TrafficLight extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(20, 30, 50, 100);
        g2.draw(box);
        Ellipse2D.Double circle = new Ellipse2D.Double(35, 40, 20, 20);
        g2.setColor(Color.red);
        g2.draw(circle);
        g2.fill(circle);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(35, 70, 20, 20);
        g2.setColor(Color.yellow);
        g2.draw(circle2);
        g2.fill(circle2);
        Ellipse2D.Double circle3 = new Ellipse2D.Double(35, 100, 20, 20);
        g2.setColor(Color.green);
        g2.draw(circle3);
        g2.fill(circle3);
        //g.setColor(Color.blue);
        //g2.draw(circle);
        //g.setColor(Color.red);
        //g.drawString("Ray", 50, 70);
    }
}
