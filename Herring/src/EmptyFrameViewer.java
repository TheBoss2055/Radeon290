import javax.swing.JFrame;

/**
 * Project: EllichComp
 *
 * Created by Brady on 5/1/2017.
 *
 * Program which constructs and allows you to view an empty frame.
 */
public class EmptyFrameViewer
{
        public static void main(String[] args) 
        {
            // Constructs, sets size, and names new Empty Frame
            JFrame frame = new JFrame(); 
            frame.setSize(300, 400); 
            frame.setTitle("An empty frame"); 

            // Closes frame upon window close
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Makes frame visible
            frame.setVisible(true);
        }
}
