/**
 * Write a description of class Bear here.
 *
 * @author Sarkisyan C
 * @version 7/8/20  13:30
 */
public class SatyrSimp extends SimpleEntity
{
    public static int instances;
    public SatyrSimp ()
    {
        super(("Satyr" + instances), 0, 1, 1);//temp
        
        actions = new Action [2];
        // actions [0] = new Attack(4, "slashing");//temp
        // actions [1] = new Attack(4, "slashing", "Strength", 11);//temp
        instances++;
    }
}