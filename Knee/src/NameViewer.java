import javax.swing.JFrame;

public class NameViewer {
    
    public NameViewer() 
    {
        //
    }
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
