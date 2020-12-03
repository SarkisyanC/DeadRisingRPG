
/**
 * allows game to call a game script without specifying which game script it is in the refrence variable's type
 *
 * @author Sarkisyan C
 * @version 6/7/20  15: 15
 */
import java.util.*;
import java.io.*;
public abstract class GameScript
{
    public static String []  fileGroup; // temp
    public static void setFileGroup(String playerCode, String scriptCode, int numFiles)
    {
        fileGroup = new String [numFiles];
        for (int i = 0; i < numFiles; i++)
        {
            fileGroup[i] = playerCode + "_" + scriptCode + "_" + (i+1) + ".txt";
        }
    }

    /**
     * returns the contents of a .txt file (called a chunk)
     */
    public static String returnCurrentChunk (int chunk) throws IOException 
    {
        String line;
        String currentChunk = "";
        Scanner fileReader = new Scanner (new File (GameScript.fileGroup[chunk]));

        while (fileReader.hasNext())
        {
            line = fileReader.nextLine();
            if(line.equals("command")) 
            {
                System.out.println("caught that it's a command");//temp testor
                GameScript.interpretCommand(fileReader.nextLine());//todo: make a method for it to call from here -- make sure it uses up all the rest of the lines so no more of them print
            }
            else
            {
                currentChunk += line;
                currentChunk += "\n";  
            }
        }
        fileReader.close();
        currentChunk += "\n";
        return currentChunk;
    }

    public static void showScript(String playerCode, String scriptCode, int numFiles)  throws IOException
    {
        TreeManScript.setFileGroup(playerCode, scriptCode, numFiles);
        for(int i = 0; i < numFiles; i++)
        {
            System.out.println(GameScript.returnCurrentChunk(i)); 
        }
    }

    public static void interpretCommand(String command)
    {
        String arg3;
        String comCode;
        String charCode;//specifies which charecter to execute this comand on
        int amount;//temp not sure which vars needed
        StringTokenizer tokenizer = new StringTokenizer (command, ",");
        comCode = tokenizer.nextToken();
        charCode = tokenizer.nextToken();
        arg3 = tokenizer.nextToken();
        if (Character.isDigit(arg3.charAt(0))) 
        {
            amount = Integer.parseInt(tokenizer.nextToken());
            executeCommand(comCode, charCode, amount);  
        }
        else executeCommand(comCode, charCode, arg3);  
    }

    public static void executeCommand(String comCode, String charCode, int amount)//temporary args -- not quite sure how to go about these methods yet -- perhaps make an overide method if more args needed?
    {
        char comType = comCode.charAt(0);
        switch(comType)
        {
            case 'h'://health
            Commands.executeHealthCom(comCode, charCode, amount);
            break;
            case 'a'://armor
            Commands.executeArmorCom(comCode, amount);
            break;
            case 'A'://actions
            //GameScript.executeActionCom(comCode, amount);
            break;
            case 'i'://initiative
            //GameScript.executeInitCom(comCode, amount);
            break;
            case 'm'://mana
            //GameScript.executeManaCom(comCode, amount);
            break;   
        }
    }

    public static void executeCommand(String comCode, String charCode, String arg3)//temporary args -- not quite sure how to go about these methods yet -- perhaps make an overide method if more args needed?
    {
        char comType = comCode.charAt(0);
        switch(comType)//temp: fix this so only relates to nessisary codes
        {
            case 'h'://health
            //  Commands.executeHealthCom(comCode, charCode, amount);
            break;
            case 'a'://armor
            // Commands.executeArmorCom(comCode, amount);
            break;
            case 'A'://actions
            //GameScript.executeActionCom(comCode, amount);
            break;
            case 'i'://initiative
            //GameScript.executeInitCom(comCode, amount);
            break;
            case 'm'://mana
            //GameScript.executeManaCom(comCode, amount);
            break;
            case 'p'://prompts
            Commands.executePromptCom(comCode, charCode, arg3);
            break;
        }
    }

    public abstract String getPlayerCode();

    public abstract String getScriptCode();

    public abstract int getNumFiles (String scriptCode);

    public abstract void updateScriptCode (String scriptCode);
}
