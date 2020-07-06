
/**
 * Holds a template to be used in creating any 
 * Charecter in the game, be it a PC, NPC or SimpleFoe
 *
 * @author Sarkisyan C
 * @version 7/6/20  11:00
 */
public abstract class Charecter implements Foe
{
    public int healthCurrent;   //the amount of health you curently have
    public int healthBase;      //the normal amount of health you start with
    public int healthModifier;  //stores any modifiers including temporary health
    
    public int armorBase;       //the amount of armor you curently have
    public int armorModifier;   //the normal amount of armor you start with
    public int armorCurrent;    //stores any modifiers including temporary armor like sheilds or spells
    
    public int initiativeBase;
    public int initiativeModifier;
    public int initiativeCurrent;
    
    //public Equiptment gear; //make a list or something(hash table)?
}
