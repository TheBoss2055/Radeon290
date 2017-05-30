import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Project: EllichComp
 *
 * Created by Brady Herring on 5/23/17 at 10:48 AM.
 *
 * An enhanced action listener that prints a message and returns the number of times clicked.
 */
public class EnhancedClickListener implements ActionListener
{
    public int number = 0;

    public void actionPerformed(ActionEvent event)
    {
        number += 1;
        if(number == 1)
        {
            System.out.println("I was clicked " + number + " time.");
        }
        else
        {
            System.out.println("I was clicked " + number + " times.");
        }
    }
}
