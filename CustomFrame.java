
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
        JButton button = new JButton("click me");
        JTextArea textArea = new JTextArea();
        //add the components to the content pane
        Container c = getContentPane();
        c.add(textArea, BorderLayout.CENTER);
        c.add(button, BorderLayout.SOUTH);
    }
}
