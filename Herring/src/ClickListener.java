import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/17/17.
 *
 * An action listener that prints a message.
 */
public class ClickListener implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("I was clicked.");
    }
}
