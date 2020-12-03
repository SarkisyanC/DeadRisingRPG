
/**
 * stores template for creating a more detailed Entity
 *
 * @author Sarkisyan C
 * @version 7/6/20  11:00
 */
public abstract class ComplexEntity extends Entity
{
    public Equiptment [] gear; //make a list or something(hash table)?
    public int numGear;
    public int xp;      //stores the amount of experience points earned
    public int level;   //stores level (based on xp)
    public int skillBonus;   //stores bonus amount for small-scale expertise (skills)  
    public String name; //stores Entity's full (known) name
    public String nickname; //stores Entity's nickname
    //stores bonus amount for large-scale expertises
    public int conMod;
    public int dexMod;
    public int strengthMod;
    public int smartMod;
    public int charmMod;
    public int numAttacks;//the amount of atacks they can chose from
    public Skills skills;
    
    //****************constructors***************
    public ComplexEntity (int inHealthBase, int inArmorBase, int inInitiativeBase, int inActionsBase)//no name
    {
       super(inHealthBase, inArmorBase, inInitiativeBase, inActionsBase ); 
    }
    
    public ComplexEntity (int inHealthBase, int inArmorBase, int inInitiativeBase, int inActionsBase, String inName)//no nickname
    {
       super(inHealthBase, inArmorBase, inInitiativeBase, inActionsBase ); 
       name = nickname = inName;
    }
    
    public ComplexEntity (int inHealthBase, int inArmorBase, int inInitiativeBase, int inActionsBase, String inName, String inNickname)
    {
       super(inHealthBase, inArmorBase, inInitiativeBase, inActionsBase ); 
       name = inName;
       nickname = inNickname;
    }
    //************end constructors*****************
    
    
    //**********xp and level***********
    public void addXp (int amount)
    {
        xp += amount;
        updateLevel();
    }
    
    public abstract void updateLevel ();
    
    public int getLevel()
    {
       return level; 
    }
    //*******end xp and level**************
    
    
    /**
     * refills all current stats to base value (without modifiers)
     */
    public void longRest()
    {
        healthCurrent = healthBase;
        armorCurrent = armorBase;
        initiativeCurrent = initiativeBase;
        actionsCurrent = actionsBase;
        //more specific classes should override to have more specific details on what is reset (ie: once per rest abilities)
    }
    //adds Equiptment to gear
    public void addEquiptment(Equiptment newGear)//todo: fix this -- it's not working fully
    {
        System.out.println(numGear);//temp testor
        gear[numGear] = newGear;
        numGear++;
        
        //abilities[numAbilities] = newGear.getAttack();//todo: update weapons to reflect this
        //NumAbilities++;
    }
    
    
    
    
    /**
     * Used for internal testing only -- returns all aspects of the charecter
     */
    public String toString()
    {
        String fullReport = "";
        fullReport += "Basic Information:\n\tName: ";
        fullReport += name;
        fullReport += ("\n\tNickname: " + nickname);
        fullReport += "\nBasic Stats:\n";
        fullReport += this.getHealthStats();
        fullReport += "\n";
        fullReport += this.getArmorStats();
        //todo: add more here
        //fullReport += getGear;//todo: move the gear method to here or at least part of it that makes the String
        
        return fullReport;
    }
}
