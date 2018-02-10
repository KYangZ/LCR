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
public class GameRecord {
    private ArrayList <Player> players = new ArrayList<Player>(); 
    private String file;

    public GameRecord(String file){
        this.file = file;
    }

    public ArrayList<Player> retrieveData(){
        try { 
            Scanner sc = new Scanner(new File(this.file));
            String str = "";
            String[] data;
            int ID = 1;
            
            while(sc.hasNextLine()){
                str = sc.nextLine();
                data = str.split(",");
                Player name = new Player(data[0], 5, ID, Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                players.add(name);
                ID++;
               
            }
            sc.close();  //close the scanner

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
        
        
        return players;
        
    }
    
    public void updateRecord(/*pass parameters here */){
        
        
    }
    
}
