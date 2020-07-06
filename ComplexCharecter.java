
/**
 * stores template for creating a more detailed Charecter
 *
 * @author Sarkisyan C
 * @version 7/6/20  11:00
 */
public abstract class ComplexCharecter extends Charecter
{
    public int xp;      //stores the amount of experience points earned
    public int level;   //stores level (based on xp)
    
    public String name;//stores Charecter's name
    
    public void gainXp (int xpGained)
    {
        xp += xpGained;
        updateLevel();
    }
    public void updateLevel ()
    {
       //add switch statement to see if need to change level 
    }
    public int getLevel()
    {
       return level; 
    }
}
