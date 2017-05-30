import javax.swing.JFrame;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/12/2017.
 *
 * Program which allows you to view a flag created in FlagComponent.
 */
public class FlagViewer {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300,400);
        frame.setTitle("Italian Flag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlagComponent component = new FlagComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}