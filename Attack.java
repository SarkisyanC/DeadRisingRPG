
/**
 * Abstract class Attack - write a description of the class here
 *
 * @author Sarkisyan C
 * @version 6/7/20 15:45
 */
public class Attack extends Action
{
    public int damage;  //might make this a class of it's own?
    public String type; //might make this a class of it's own (part of above class)?
    public String saveType;
    public String label;
    public Attack (String inLabel, int inDamage, String inType)
    {
        damage = inDamage;
        type = inType;
        label = inLabel;
    }
    
    public Attack (String inLabel, int inDamage, String inType, String saveType, int DC)
    {
        damage = inDamage;
        type = inType;
        label = inLabel;
    }
}