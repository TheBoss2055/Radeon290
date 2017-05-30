import javax.swing.*;

/**
 * Created by TheBo on 5/12/2017.
 */
public class barGraphViewer
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(1000,500);
        frame.setTitle("Bar Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        barGraph component = new barGraph();
        frame.add(component);
        frame.setVisible(true);
    }
}