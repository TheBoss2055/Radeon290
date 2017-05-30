import javax.swing.JFrame;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/10/2017.
 *
 * Program which allows you to view a name created in NameComponent.
 */
public class NameViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Name");
        frame.setDefaultCloseOperation(3);
        NameComponent component = new NameComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
