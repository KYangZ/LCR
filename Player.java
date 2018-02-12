import java.util.ArrayList;
/**
 * Player object with the following attributes: name, chips, ID, wins, losses
 * Also keeps track of winner status in a game
 *
 * @author Kristy Lee, Kory Yang
 * @version 20180211
 */
public class Player
{
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
    
    public void setChips(int n){
        this.chips = n;
    }
    
    public void addWin(){
        wins++;
    }
    
    public void addLoss(){
        losses++;
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
    
    public int getWins(){
        return this.wins;
    }
    
    public int getLosses(){
        return this.losses;
    }
    
   
}
