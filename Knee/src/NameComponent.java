import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class NameComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(20, 30, 100, 70);
        g.setColor(Color.blue);
        g2.draw(box);
        g.setColor(Color.red);
        g.drawString("Ray", 50, 70);
    }
}
