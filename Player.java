
/**
 * Holds information on the player's charecter
 *
 * @author Sarkisyan C
 * @version 7/6/20  12:00
 */
public interface Player 
{
    public void setName(String inName);
    public String toString();   //used for internal testing only
    public void showStatus();  //prints the Player's healthCurrent, armorCurrent, level, xp
    public void showAbilities();//prints all player's actions and bonus actions with their descriptions
    public void showBelongings();//prints all the player's belongings and their properties (if any)
    public void addEquiptment(Equiptment newGear);//adds Equiptment to gear
}
