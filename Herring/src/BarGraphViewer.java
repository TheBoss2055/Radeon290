import javax.swing.*;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/15/2017.
 *
 * Program which allows you to view the bar graph created in BarGraphComponent.
 */
public class BarGraphViewer
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(620,460);
        frame.setTitle("Bar Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BarGraphComponent component = new BarGraphComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}