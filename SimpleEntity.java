
/**
 * Stores template for Entitys without too many details
 *
 * @author Sarkisyan C
 * @version 7/6/20  11:00
 */
public abstract class SimpleEntity extends Entity
{
    String label;//holds a basic label for the charecter(its class + id#)
    public SimpleEntity (String inLabel, int inInitiativeBase, int inActionsBase, int inChalengeLevel)//basic simple charecter
    {
        super((inChalengeLevel * 10), (inChalengeLevel + 10), inInitiativeBase, inActionsBase, inChalengeLevel);
        label = inLabel;
    }
    public SimpleEntity (String inLabel,int inHealthBase, int inArmorBase, int inInitiativeBase, int inActionsBase, int inChalengeLevel)//variant simple charecter
    {
        super(inHealthBase, inArmorBase, inInitiativeBase, inActionsBase, inChalengeLevel);
        label = inLabel;
    }
    
    /**
     * Used for internal testing only -- returns all aspects of the charecter
     */
    public String toString()
    {
        String fullReport = "";
        fullReport += "Basic Information:\n\tName: ";
        //fullReport += name;
        //fullReport += ("\n\tNickname: " + nickname);
        fullReport += "\nBasic Stats:\n";
        fullReport += this.getHealthStats();
        //todo: add more here
        //fullReport += getGear;//todo: move the gear method to here or at least part of it that makes the String
        
        return fullReport;
    }
}
