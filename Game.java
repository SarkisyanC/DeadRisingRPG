
/**
 * holds the information for a Game
 *
 * @author Sarkisyan C
 * @version 6/7/20 15:00
 */


import java.util.*;
import java.io.*;

public class Game
{
    public static Player player;
    public static GameScript script;
    public static Entity [] npcArray; //holds all charecters (apart from player) introduced in gameplay//todo: figure out how to make this a hash table instead
    //add a hash table holding players by player code
    public Game ()   //temporary default game setup (TreeMan)
    {
        player = new TreeMan();
        script = new TreeManScript();
        npcArray = new Entity [10];//temp, maybe make this a hash table instead?
    }
    
    public Game (String playerCode, GameScript inScript) //sets up with option of chosing charecter and script (must align)
    {//temp: not finished
        //todo: get coresponding player from hash table based on playerCode
        //player = <var from above line>;
        script = inScript;
        npcArray = new Entity [10];//temp, maybe make this a hash table instead?
    }
    
    public Game (Player inPlayer, GameScript inScript, Entity [] inArray)  //for a saved game 
    {
        //todo: add more params -- this method will be refined when load game is finalized
    }
    //********end of constructors************
    
    public String getPlayerCode()
    {
        return script.getPlayerCode();
    }
    public String getScriptCode()
    {
        return script.getScriptCode();
    }
    public int getNumFiles()
    {
        return script.getNumFiles(this.getScriptCode());
    }
    public void updateScriptCode(String newScriptCode)
    {
        script.updateScriptCode(newScriptCode);
    }
}
