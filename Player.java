import java.util.ArrayList;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    
    private ArrayList<Dice> dice = new ArrayList<Dice>();
    private String name;
    private int chips;
    private int ID;
    private boolean win = false;
    private int wins;
    private int losses;
    
    public Player(String name, int chips, int ID, int wins, int losses){
        this.name = name;
        this.chips = chips;
        this.ID = ID;
        this.wins = wins;
        this.losses = losses;
    }
    
    public void addChips(){
        this.chips++;
    }
    
    public void removeChips(){
        this.chips--;
    }
    
    public void playerTurn(){
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getChips(){
        return this.chips;
    }
    
    public int getID(){
        return this.ID;
    }
   
}
