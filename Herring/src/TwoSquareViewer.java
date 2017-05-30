import javax.swing.JFrame;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/1/2017.
 *
 * Program which allows you to view the two squares created in TwoSquareComponent.
 */
public class TwoSquareViewer
{
    public static void main(String[] args)
    {
       JFrame frame = new JFrame(); 
       
       frame.setSize(300,400);
       frame.setTitle("Two Squares");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       TwoSquareComponent component = new TwoSquareComponent();
       frame.add(component);
       frame.setVisible(true);
    }
}
