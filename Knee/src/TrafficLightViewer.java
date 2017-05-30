import javax.swing.JFrame;

public class TrafficLightViewer {

    public TrafficLightViewer()
    {
        //
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Name");
        frame.setDefaultCloseOperation(3);
        TrafficLight component = new TrafficLight();
        frame.add(component);
        frame.setVisible(true);
    }
}
