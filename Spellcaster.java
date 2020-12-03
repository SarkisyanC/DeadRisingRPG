
/**
 * Outlines the details specific to Spellcaster-type complex charecters
 *
 * @author Sarkisyan C
 * @version 7/7/20  9:45
 */
public abstract class Spellcaster extends ComplexEntity
{   public int manaBase;        //the base amount of spellcasting energy you have -- small spells use zero leveled spells use the number of their level
    public int manaCurrent;
    public int manaModifier;
    
    public Spell [] spells;     //holds all the spells you know
    
    public Spellcaster (int inConMod, int inArmorBase, int inInitiativeBase, int inActionsBase, int inManaBase)
    {
        super(inConMod, inArmorBase, inInitiativeBase, inActionsBase);
        manaCurrent = manaBase = inManaBase;
        
    }
    public void longRest ()
    {
        healthCurrent = healthBase;
        armorCurrent = armorBase;
        initiativeCurrent = initiativeBase;
        actionsCurrent = actionsBase;
        manaCurrent = manaBase;
        
    }
}
