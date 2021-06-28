
/**
 * Abstract class CustomFrame - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */

import java.awt.*;
import javax.swing.*;
public abstract class CustomFrame extends JFrame
{
   public CustomFrame (int size_x, int size_y)
    {
        super("Dead Rising RPG");
        
        //set layout
        setLayout(new BorderLayout());
        this.setSize(size_x,size_y);
        this.setVisible(true);   
       
    }
}
