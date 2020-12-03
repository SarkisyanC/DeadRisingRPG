
/**
 * A weapon that deals 8 slashing damage and can have damage added to it
 *
 * @author Sarkisyan C
 * @version 6/7/20 16:00
 */
public class Axe extends Weapon
{
    public boolean twoHanded;
    /**
     * creates an Axe with the attack 8 slashing damage, 
     * with option of using two hands to do 10 damage instead
     */
    public Axe( )
    {
        super("Axe", 8, "slashing", 10);
    }
}
