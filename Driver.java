//
/**
 * Currently in progress and subject to change
 * handles the user-interactive portion of the game
 *
 * @author Sarkisyan C
 * @version 7/6/20  11:30
 */

import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
public class Driver
{
    public static void main (String [] args) throws IOException
    {
       //todo: add an array of files, or maybe a tree?// maybe refrence a class holding this tree as a hard coded thing?
       //todo: add a file reader 
       Scanner input = new Scanner (System.in);
       Game currentGame;
       SwingUtilities.invokeLater(new Runnable() 
       {
            public void run ()
            {
                JFrame frame = new JFrame("Dead Rising RPG");
                frame.setSize(500,400);
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program on x
                frame.setVisible(true);   
            }
        });
       
       //todo: figure out a way to display game to users with clickable buttons, etc
       //todo: figure out a way to save progress so a player can start from where they stoped -- maybe have it stored in a .txt that can be fed into a method to simulate the gameplay up to the current point?
       //**************gameplay portion*******************
       
       //game intro
       
       System.out.println("Welcome to Dead Rising RPG\n1.)New Game \n2.)Load Game");//temp
       
       //handles if user choses Load game (current solution is temporary)
       if(input.nextInt() != 1) System.out.println("This gameplay option is currently not supported. Please enjoy your new game."); //temp
       
       currentGame = new Game();//todo: might eventualy have 2 difrent charecter options for player to chose from
       GameScript.showScript(currentGame.getPlayerCode(), currentGame.getScriptCode(), currentGame.getNumFiles());
       
       //currentGame.player.addEquiptment(new Shield("Wooden Shield"));
       //currentGame.player.addEquiptment(new Axe(1));//temp: find a way to get it to access the player instead
       
       System.out.println("would you like to view your belongings\n1.)yes\n2.)no");
       if(input.nextInt() == 1) currentGame.player.showBelongings();
       
       System.out.println("would you like to view your charecter\n1.)yes\n2.)no");
       if(input.nextInt() == 1) System.out.println(currentGame.player.toString());
    }
}
