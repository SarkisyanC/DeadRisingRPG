
/**
 * Abstract class LeveledSpell - write a description of the class here
 *
 * @author Sarkisyan C
 * @version 6/7/20  17:00
 */
public abstract class LeveledSpell extends Action implements Spell
{
    public int level;
    
    public boolean canCast (int level)
    {
        //if (this.hasSpells == true && mana != 0) return true; //todo: fix coresponding classes so this can work
        //else return false;
        return false;//temp
    }
    
    public void cast(int level)//temp:make this abstract and make it difrent for each spell!
    {
        //if (canCast(level)) mana -= level;//todo: fix (can't access mana)
        //todo: call do damage or whatever else it's effects are
    }
}
