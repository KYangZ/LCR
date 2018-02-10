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
        for (int i = 0; i < 3; i++){
            dice.add(new Dice());
        }
    }
    
    public void addChips(){
        this.chips++;
        this.addDice();
    }
    
    public void removeChips(){
        this.chips--;
        this.removeDice();
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
    
    public void removeDice(){
        if (dice.size() == 0){ //fail fast
            //does nothing. cannot remove a dice when having 0 dice already
        }
        else{
            dice.remove(0);
        }
            
    }
    
    public void addDice(){
        if (chips >= 3){ //fail fast
         //does nothing. maximum number of dice is 3
        }
        else{
            dice.add(new Dice());
        }
    }
    
    public int getDiceSize(){
        return dice.size();
    
    }
    
    public String roll(){
       String str = "";
       for (int i = 0; i < getDiceSize(); i++){
           if (dice.get(i).roll() == 4 || dice.get(i).roll() == 0){
               
               //do nothing
           }
           
           else{ 
               str += "" + dice.get(i).roll(); //roll the dice at the specified position (i)
            
           }
           
           if (i == getDiceSize()-1){
                //add no comma to string
           }
           else
                str += ",";
           
        }
        
        //format of str should be #,#,# or #,# or # 
        
        if (str.length() < 5){
            str = str.substring(0,str.length() - 1); //remove extra comma if any of the 3 rolls did not result in L C or R
        }
       
        return str;
       
        
    }
   
}
