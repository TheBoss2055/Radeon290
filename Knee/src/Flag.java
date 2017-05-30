import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class Flag extends JComponent{

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //
        Rectangle box = new Rectangle(5, 10, 20, 30);
        //g2.draw(box);
        g.setColor(Color.green);
        g.fillRect(0, 10, 50, 100);
        //
        g.setColor(Color.white);
        //box.translate(10, 0);
        g.fillRect(50, 10, 50, 100);
        //
        g.setColor(Color.red);
        g.fillRect(100, 10, 50, 100);
        //g2.draw(box);

        //Ellipse2D.Double circle = new Ellipse2D.Double(50, 35, 50, 50);
        //g2.setColor(Color.red);
        //g2.draw(circle);
        //g2.fill(circle);
    }
}

