
/**
 * A SmallSpell that gives allies an extra 6 points 
 * to add to any modifier or roll
 *
 * @author Sarkisyan C
 * @version 7/7/20  11:40
 */
public class Inspire extends SmallSpell
{
    public final int damageBase = 0;
    public int getDamage ()
    {
        return damageBase;
    }
    public static void cast (Charecter target)
    {
        target.addExtraPoints(6);
    }
}
