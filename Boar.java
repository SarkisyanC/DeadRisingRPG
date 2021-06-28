
/**
 * A low-level foe for Player to face
 * rural environments only
 * 
 * Has: 
 *  level 1 chalenge rating
 *  xp reward 10
 *  health 10
 *  armor 11
 *  0 base initiative
 *  1 action per turn
 *  
 *
 * @author Sarkisyan C
 * @version 7/7/20  12:00
 */
public class Boar extends SimpleEntity
{
    public static int instances;
    public Boar ()
    {
        super(("Boar" + instances), 0, 1, 1);
        
        actions = new Action [2];
        actions [0] = new Attack("tusk", 4, "slashing");
        actions [1] = new Attack("charge", 4, "slashing", "Strength", 11);
        instances++;
    }
}
