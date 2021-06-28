
/**
 * a custom version of JFrame to use for this game
 *
 * @author Chris Sarkisyan
 * @version 6/28/2021
 */

import java.awt.*;
import javax.swing.*;

public class CustomFrame extends JFrame
{
    public CustomFrame ()
    {
        super("Dead Rising RPG");
        
        //set layout
        setLayout(new BorderLayout());
        this.setSize(1200,800);
        this.setVisible(true);   
        
        //create swing component
        JButton b1 = new JButton("next");
        JButton b2 = new JButton("see inventory");
        JButton b3 = new JButton("see charecter details");
        //JTextArea textArea = new JTextArea();
        //add the components to the content pane
        Container c = getContentPane();
        //c.add(textArea, BorderLayout.CENTER);
        c.add(b1, BorderLayout.SOUTH);
        c.add(b2, BorderLayout.EAST);
        c.add(b3, BorderLayout.WEST);
    }
}
