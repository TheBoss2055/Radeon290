import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.*;



public class Checkerboard extends JComponent{

    public int xpos = 0;
    public int ypos = 0;

            public void paintComponent(Graphics g)
            {
                Graphics2D g2 = (Graphics2D) g;
                Rectangle box = new Rectangle (0, 0, 5, 5);
                //
                for (int m = 0; m < 8; m++)
                {
                    g.setColor(Color.white);
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
                            g.setColor(Color.black);
                            g.fillRect(xpos, ypos, 50, 50);
                        }
                    }
                    ypos = ypos + 50;
                    xpos = 0;
                    }

                //
                //g.setColor(Color.white);
                //box.translate(10, 0);
                //g.fillRect(50, 10, 50, 100);
                //
                //g.setColor(Color.red);
                //g.fillRect(100, 10, 50, 100);

            }
    }


