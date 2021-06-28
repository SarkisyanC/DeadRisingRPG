/**
 * Holds a template to be used in creating any 
 * Entity in the game, be it a PC, NPC or SimpleFoe
 *
 * @author Sarkisyan C
 * @version 7/6/20  11:00
 */
public abstract class Entity 
{
    public int healthCurrent;   //the amount of health you curently have
    public int healthBase;      //the normal amount of health you start with
    public int healthModifier;  //stores any modifiers including temporary health
    
    public int armorBase;       //the amount of armor you curently have
    public int armorModifier;   //the normal amount of armor you start with
    public int armorCurrent;    //stores any modifiers including temporary armor like sheilds or spells
    
    public int initiativeBase;
    public int initiativeModifier;
    public int initiativeCurrent;
    
    public int actionsBase;
    public int actionsModifier;
    public int actionsCurrent;
    
    public Action [] actions; //make a list or something(hash table)?
    public BonusAction [] bonusActions; //make a list or something(hash table)?
    
    public int extraPoints; //for when spells or other things grant you extra points to add to a modifier
    
    public String [] imune;
    public String [] resistant;
    public String [] vulnerable;
    
    //only aplicable to NPC's
    public int xpReward;
    public int challengeLevel;
    
    //********************constructors*******************
    public Entity (int inHealthBase, int inArmorBase, int inInitiativeBase, int inActionsBase)//todo: add abilities or do that in subsequent constructors!
    {
        healthBase = healthCurrent = inHealthBase;
        armorBase = armorCurrent = inArmorBase;
        initiativeBase = initiativeCurrent = inInitiativeBase;
        actionsBase = actionsCurrent = inActionsBase;
    }
    public Entity (int inHealthBase, int inArmorBase, int inInitiativeBase, int inActionsBase, int inChalengeLevel) // to make fightable charecters
    {
        healthBase = healthCurrent = inHealthBase;
        armorBase = armorCurrent = inArmorBase;
        initiativeBase = initiativeCurrent = inInitiativeBase;
        actionsBase = actionsCurrent = inActionsBase;
        
        challengeLevel = inChalengeLevel;
        xpReward = challengeLevel * 10;
    }
    
    
    //**********health****************
    public void refreshCurrentHealth()
    {
        healthCurrent = healthBase + healthModifier;
    }
    
    public int getCurrentHealth()
    {
        this.refreshCurrentHealth();
        return healthCurrent;
    }
    
    public void heal (int amount)
    {
        if(healthCurrent + amount > healthBase) System.out.println("you're already at max health -- no more healing");//temp
        else healthCurrent += amount;
        System.out.print("healing executed");
    }
    public void takeDamage (int amountDamage, String type)
    {
        int damageDealt = amountDamage;
        //if (type == imune) damageDealt = 0;//todo: update this to work for arrays
        //else if (type == resistant) damageDealt = (int)(damageDealt / 2);
        //else if (type == vulnerable) damageDealt = (damageDealt * 2);
        //else
        //  {
        //    if(healthModifier != 0) 
        //      {
        //          healthModifier = healthModifier - damageDealt;
        //          this.refreshCurrentHealth();
        //          if(healthModifier <= 0) healthModifier = 0;
        //      } 
        //     else healthCurrent = healthCurrent - damageDealt;
        //  }
        //if (healthCurrent <= 0) this.die();//todo: add a method in more specific classes on what to do if you die (ie: player has difrent protocol and npcs can be healed if 0 hp)
    }
    
    public String getHealthStats()
    {
        String healthStats = ("\tCurrent Health " + this.getCurrentHealth());
        healthStats += ("\n\tBase Health " + healthBase);
        healthStats += ("\n\tHealth Modifier " + healthModifier);
        return healthStats;
    }
    //*************************end health*************************
    
    //************************armor*************
    public String getArmorStats()
    {
        String armorStats = ("\tCurrent Armor " + armorCurrent);
        armorStats += ("\n\tBase Armor " + armorBase);
        armorStats += ("\n\tArmor Modifier " + armorModifier);
        return armorStats;
    }
    //************end armor*********
    
    //**********************extra points*******************
    public int getExtraPoints()
    {
        return extraPoints;
    }
    
    public void addExtraPoints (int inPoints)
    {
        extraPoints =  (this.getExtraPoints() + inPoints);
    }
    //**********************end extra points*******************
    
    
}
