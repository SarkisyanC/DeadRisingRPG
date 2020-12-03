
/**
 * Holds features for any Fighter type ComplexEntity
 *
 * @author Sarkisyan C
 * @version 7/6/20  12:00
 */
public abstract class Fighter extends ComplexEntity
{
    //*************for standard, starting from level 1 charecters*******************
    public Fighter (int inConMod, int inArmorBase, int inInitiativeBase, int inActionsBase)//no name
    {
        super((10 + inConMod), inArmorBase, inInitiativeBase, inActionsBase);
        level = 1;
        xp = 0;
        strengthMod = 1;
        healthBase = (10 + (conMod * level));
        skills = new Skills();
    }
    
    public Fighter (int healthBase, int inArmorBase, int inInitiativeBase, int inActionsBase, String inName)//no nickname
    {//temp change for testing
        super(healthBase, inArmorBase, inInitiativeBase, inActionsBase, inName);
        level = 1;
        xp = 0;
        strengthMod = 1;
        healthBase = (10 + (conMod * level));
        skills = new Skills();
    }
    
    public Fighter (int inConMod, int inArmorBase, int inInitiativeBase, int inActionsBase, String inName, String inNickname)
    {
        super((10 + inConMod), inArmorBase, inInitiativeBase, inActionsBase, inName, inNickname);
        level = 1;
        xp = 0;
        strengthMod = 1;
        healthBase = 10 + (conMod * level);
        skills = new Skills();
    }
    
    public Fighter (int inConMod, int inArmorBase, int inInitiativeBase, int inActionsBase, int inLevel)//for starting a charecter at a certain level
    {
        super((10 + inConMod), inArmorBase, inInitiativeBase, inActionsBase);
        level = inLevel;
        //todo: call level up feature how ever many time
        xp = 0;
        strengthMod = 1;
        healthBase = 10 + (conMod * level);
        skills = new Skills();
    }
    //todo: add atributes here
    public abstract void updateLevel ();
    
}
