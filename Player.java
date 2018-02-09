
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    public String name;
    public int chips;
    public int ID;
    public boolean win;
    
    public Player(String name, int chips){
        this.name = name;
        this.chips = chips;
        this.win = false;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setChips(int n){
        this.chips = n;
    }
    
    public void setID(int i){
        this.ID = i;
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
