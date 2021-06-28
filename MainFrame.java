
/**
 * a custom version of JFrame to use for this game
 *
 * @author Chris Sarkisyan
 * @version 6/28/2021
 */

import java.awt.*;
import javax.swing.*;

public class MainFrame extends CustomFrame
{
    public MainFrame ()
    {
        super(1200,800);
        
        //create swing component
        JButton b1 = new JButton("next");
        JButton b2 = new JButton("see charecter details");
        //JTextArea textArea = new JTextArea();
        //add the components to the content pane
        Container c = getContentPane();
        //c.add(textArea, BorderLayout.CENTER);
        c.add(b1, BorderLayout.SOUTH);
        c.add(b2, BorderLayout.NORTH);
    }
}
