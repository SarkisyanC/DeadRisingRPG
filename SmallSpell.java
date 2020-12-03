
/**
 * Abstract class smallSpell - write a description of the class here
 *
 * @author Sarkisyan C
 * @version 6/7/20  17:00
 */
public abstract class SmallSpell extends BonusAction implements Spell
{
    public final int level = 0;
    public int damageBase;//temp: unsure
    
    public boolean canCast ()
    {
        //if (this.hasSpells == true) return true; //todo: fix coresponding classes so this can work
        //else return false;
        return false;//temp
    }
    
    public int getLevel ()
    {
        return level;
    }
}
