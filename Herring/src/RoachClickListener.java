import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Project: EllichComp
 *
 * Created by Brady Herring on 5/23/17 at 11:04 AM.
 *
 * Program which constructs the click listener for use in RoachPopViewer.
 */
public class RoachClickListener implements ActionListener
{
    public int population = 2;

    public void actionPerformed(ActionEvent event)
    {
        population *= 2;
            System.out.println("Roach population is now: " + population);
    }
}
