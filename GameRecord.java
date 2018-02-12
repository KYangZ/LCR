import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
    
/**
 * Imports game record which contains player data: name of player, wins, losses
 * Updates game record with new wins and losses
 *
 * @author Kory Yang, Kristy Lee
 * @version 20180211
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
            int ID = 0;
            
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
    
    public void updateRecord(){
        try { 
            
            FileWriter write = new FileWriter(this.file,false);
            
            for(Player p : players){ //writing file for each player
                String str = "";
                str += p.getName();
                str += ",";
                str += Integer.toString(p.getWins());
                str += ",";
                str += Integer.toString(p.getLosses());
                write.write(str);
                write.write(System.getProperty("line.separator"));
            }

            write.close(); 

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
        
    }
    
}
