
/**
 * Holds features for any Bard type ComplexCharecter
 *
 * @author Sarkisyan C
 * @version 7/7/20  9:30
 */
public abstract class Bard extends Spellcaster
{
    public Bard (int inConMod, int inArmorBase, int inInitiativeBase, int inActionsBase, int inManaBase)
    {
        super ((9 + inConMod), inArmorBase, inInitiativeBase, inActionsBase, inManaBase);
        //skills [0] = "preformance";//todo: fix
    }
    //todo: add atributes here
    public void updateLevel ()
    {
        
    }
}
