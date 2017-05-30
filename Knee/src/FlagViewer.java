import javax.swing.JFrame;


public class FlagViewer {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300,400);
        frame.setTitle("Two rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Flag component = new Flag();
        frame.add(component);
        frame.setVisible(true);
    }
}