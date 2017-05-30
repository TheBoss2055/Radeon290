import javax.swing.JFrame;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/12/2017.
 *
 * Program which allows you to view the Checkerboard created in CheckerboardComponent.
 */
public class CheckerboardViewer {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(415,439);
        frame.setTitle("Checkerboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CheckerboardComponent component = new CheckerboardComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}