import javax.swing.JFrame;

public class TwoSquareViewer
{
    public static void main(String[] args)
    {
       JFrame frame = new JFrame(); 
       
       frame.setSize(300,400);
       frame.setTitle("Flag");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       twoSquareComponent component = new twoSquareComponent();
       frame.add(component);
       frame.setVisible(true);
    }
}
