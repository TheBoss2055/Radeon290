import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Firefoxray
 */
public class RoachClickListener implements ActionListener
{
    public int population = 2;

    public void actionPerformed(ActionEvent event)
    {
        population = population * 2;
            System.out.println("Roach population is now: " + population);
    }
}
