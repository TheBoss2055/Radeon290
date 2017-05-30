import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *MY NAME IS RAMON BARRETT
 */
public class EnhancedClickListener implements ActionListener
{
    public int number = 0;

    public void actionPerformed(ActionEvent event)
    {
        number = number + 1;
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
