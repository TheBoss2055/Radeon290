import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class twoSquareComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //
        Rectangle box = new Rectangle(5, 10, 20, 30);
        g2.draw(box);
        g.setColor(Color.pink);
        g.fillRect(5, 10, 20, 30);
        //
        g.setColor(Color.magenta);
        
        box.translate(30, 0);
        g.fillRect(35, 10, 20, 30);
        //
        g2.draw(box);
    }
}
