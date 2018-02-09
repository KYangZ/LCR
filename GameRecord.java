import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;

    
    
/**
 * Write a description of class GameRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameRecord
{
    private static ArrayList <Player> players = new ArrayList<Player>(); //static for now need to change later?

    /**
     * Constructor for objects of class GameRecord
     */
    public GameRecord(){
        
    }

     public static void retrieveData(){
        try { 
            Scanner sc = new Scanner(new File("LCRPlayers.txt"));
            String str = "";
            String[] data;
            int ID = 1;
            
            while(sc.hasNextLine()){
                str = sc.nextLine();
                data = str.split(",");
                Player temp = new Player(data[0], 5, ID, Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                players.add(temp);
                ID++;
               
                //Player name = new Player(data[0],);

            }
            sc.close();  //close the scanner

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
        
    }
}
