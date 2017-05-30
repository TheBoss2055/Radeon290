import javax.swing.JFrame;


public class CheckerboardViewer {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(415,439);
        frame.setTitle("Checkerboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Checkerboard component = new Checkerboard();
        frame.add(component);
        frame.setVisible(true);
    }
}