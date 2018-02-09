
/**
 * Write a description of class GameRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;

public class GameRecord
{
    //public ArrayList<Player> players = new ArrayList<Player>();
    
    
    
    public GameRecord(){
    }
    
    public static void retrieveData(){
        try { 
            Scanner sc = new Scanner(new File("LCRPlayers.txt"));
            String str = "";
            String[] data;
            
            while(sc.hasNextLine()){
                str = sc.nextLine();
                data = str.split(",");
                //Player name = new Player(data[0],);

            }
            sc.close();  //close the scanner

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}
