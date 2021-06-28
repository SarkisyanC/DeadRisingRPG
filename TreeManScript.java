    
    /**
     * holds the script file refrences for TreeMan
     *
     * @author Sarkisyan C
     * @version 7/6/20   13:30
       */

    import java.util.*;
    import java.io.*;

public class TreeManScript extends GameScript//temp: may have to make multiple tree man script files for each part of the story?
{
    protected static final String PLAYER_CODE = "TM";    
    protected String scriptCode;
    
    protected static final int NUM_1_FILES = 10;//temp: make these into a hash table!!!!
    protected static final int NUM_2_FILES = 1;//temp

    public TreeManScript () 
    {
         scriptCode = "1";
    }
    public String getScriptCode ()
    {
        return scriptCode;
    }
    public String getPlayerCode ()
    {
        return PLAYER_CODE;
    }
    public int getNumFiles (String scriptCode)
    {
        //todo: have this reference the hash table to the slot coresponding to the script code
        return NUM_1_FILES;//temp testor
    }
    public void updateScriptCode (String newCode)
    {
        scriptCode = newCode;
    }
}
