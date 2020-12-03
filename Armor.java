
/**
 * Abstract class Armor - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Armor extends Equiptment
{
    public boolean isOn;    //if charecter is wearing the armor
    public int power;       //how much armor points it provides
    public Armor (String inLabel, int amount)
    {
        isOn = false;
        label = inLabel;
        power = amount;
        //todo: access and add this to owner's equiptment?
    }
    
    public void equip(Entity target)
    {
        isOn = true;
        target.armorModifier +=power;
    }
    
    public void dequip(Entity target)
    {
        isOn = false;
        target.armorModifier -=power;
    } 
}
