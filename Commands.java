
/**
 * Holds commands to be called by the gamescript 
 * when refrencing .txt documents particular to 
 * the script in use
 *
 * @author Sarkisyan C
 * @version 7/8/20  10:00
 */

import java.util.*;
public class Commands
{
    public static void executeHealthCom(String comCode, String charCode, int amount)
    {
        Entity affected;//stores the charecter you're operating on
        System.out.println(charCode);
        if(charCode.equals("p")) 
        {
            System.out.println("recognises 'p'");//temp testor
            affected = (Entity) Game.player;
        }
        else 
        {
            System.out.println("doesn't recognise 'p'");//temp testor
            affected = Game.npcArray[0];//temp: npc array shoud be changed to hash table
        }
        switch(comCode)
        {
            case "hc+"://healthCurrent +
                System.out.println("Command hc+ executed");//temp testor
                affected.heal(amount);
            break;
            case "hc-"://healthCurrent -
            //
            break;
            case "hm+"://healthModifier +
            //
            break;
            case "hm-"://healthModifier -
            //
            break;
            case "hb+"://healthBase +
            //
            break;
            case "hb-"://healthBase -
            //
            break;
        }
    }

    public static void executeArmorCom(String comCode, int amount)//temp: have better names for arg1 etc
    {
        switch(comCode)//todo: update comments
        {
            case "ac+"://armorCurrent +
            //
            break;
            case "ac-"://armorCurrent -
            //
            break;
            case "am+"://armorModifier +
            //
            break;
            case "am-"://armorModifier -
            //
            break;
            case "ab+"://armorBase +
            //
            break;
            case "ab-"://armorBase -
            //
            break;
            case "ase"://sheild equip
                //affected.
            break;
            case "asd"://sheild dequip
            //
            break;
        }
    }
    
    public static void executePromptCom (String comCode, String choice1, String choice2)
    {
        Scanner user = new Scanner(System.in);
        int choice;
        System.out.println("\t1.)" + choice1 + "\n\t2.)" + choice2);//temp change this to more user freindly
        choice = user.nextInt();
        
        //temp -- find a better way to do this
    }
    
    
}
