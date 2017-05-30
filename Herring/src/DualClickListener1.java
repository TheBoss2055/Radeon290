import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Project: EllichComp
 *
 * Created by Brady Herring on 5/23/17 at 11:16 AM.
 *
 * An enhanced action listener that prints a message and returns the number of times clicked.
 */
public class DualClickListener1 implements ActionListener
{
    private int number = 0;

    public void actionPerformed(ActionEvent event)
    {
        number += 1;
        if(number == 1)
        {
            System.out.println("Button 1 was clicked " + number + " time.");
        }
        else
        {
            System.out.println("Button 1 was clicked " + number + " times.");
        }
    }
}
