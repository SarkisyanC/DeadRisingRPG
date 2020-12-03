
/**
 * Write a description of class Skills here.
 *
 * @author Sarkisyan C
 * @version 7/7/20  11:40
 */
public class Skills
{
    public boolean hasStealth, hasAthletics, hasPerception, hasPersuasion, hasPerformance;//todo: finish this list
    public final static String [] ALL_SKILLS = {"Stealth", "Athletics", "Perception", "Persuasion", "Intimidation", "Preformance" };//todo: finish this list
    public Skills () // temp: default testor
    {
        hasAthletics = true;
        
    }
    
    public String getSkills () //temp: testor
    {
        if (hasAthletics == true) return "yes";
        else return "no";
    }
}
