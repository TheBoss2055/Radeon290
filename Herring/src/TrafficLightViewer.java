import javax.swing.JFrame;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/11/2017.
 *
 * Program which allows you to view the traffic signal created in TrafficLightComponent.
 */
public class TrafficLightViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Name");
        frame.setDefaultCloseOperation(3);
        TrafficLightComponent component = new TrafficLightComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
