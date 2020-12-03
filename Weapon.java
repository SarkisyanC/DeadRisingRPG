
/**
 * Write a description of interface weapon here.
 *
 * @author Sarkisyan C
 * @version 6/7/20 15:20
 */
public abstract class Weapon extends Equiptment
{
    public int damageNum;       //how much armor points it provides
    public String damageType;
    public Weapon (String inLabel, int amount, String type)
    {
        label = inLabel;
        damageNum = amount;
        damageType = type;
        //todo: access and add this to owner's equiptment?
    }
    public Weapon (String inLabel, int amount, String type, int twoHandedDamage)
    {
        label = inLabel;
        damageNum = amount;
        damageType = type;
        //todo: access and add this to owner's equiptment?
    }
}
