
/**
 * holds information on the playable charecter TreeMan
 *
 * @author Sarkisyan C
 * @version 6/7/20  13:30
 */
public class TreeMan extends Fighter implements Player
{ 
    public final static GameScript script = new TreeManScript();// the script the game uses (based on the charecter being played)
    
    
    public TreeMan ()
    {
        super(12, 14, 4, 1,"Angkor");//sets up complex charecter elements
        gear = new Equiptment [10];//todo: make this a beter storage, maybe hash table?
        conMod = 2;
        strengthMod = 1;
        dexMod = smartMod = charmMod = 0;
    }
    
    /**
     * sets the Player's name to what the user inputs
     * @param String inName -- The name the user wants to change name to
     */
    public void setName(String inName)
    {
        name = inName;
    }
    /**
     * sets the Player's name to what the user inputs
     * @param String inName -- The name the user wants to change name to
     */
    public void setNickname(String inNickname)
    {
        nickname = inNickname;
    }
    
    //*******interface methods (perhaps shift to complex char?)
    
    
    //prints the Player's healthCurrent, armorCurrent, level, xp
    public void showStatus()
    {
        
    }
    //prints all player's actions and bonus actions with their descriptions
    public void showAbilities()
    {
        
    }
    //prints all the player's belongings and their properties (if any)
    public void showBelongings()//fix this to nly print the full slots
    {
        String allBelongings = "Your Belongings:\n\t";
        for (int i = 0; i < gear.length; i++)
        {
            allBelongings += gear[i];
            allBelongings += "\n\t";
        }
        System.out.println(allBelongings);
    }
    
    public void updateLevel ()
    {
        //todo: fill this out
    }
}
