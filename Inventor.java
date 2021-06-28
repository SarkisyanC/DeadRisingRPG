/**
 * Holds features for any Inventor type ComplexCharecter
 *
 * @author Sarkisyan C
 * @version 7/7/20  9:00
 */
public abstract class Inventor extends Spellcaster
{
    public Inventor (int inConMod, int inArmorBase, int inInitiativeBase, int inActionsBase, int inManaBase)
    {
        super ((9 + inConMod), inArmorBase, inInitiativeBase, inActionsBase, inManaBase);
        //skills [0] = "preformance";//todo: fix
    }
    
    //todo: add atributes here
    public void updateLevel ()
    {
        
    }
}