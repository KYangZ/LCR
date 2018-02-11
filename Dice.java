/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
import java.util.ArrayList;

public class Dice
{
    private int rollValue;
    private int dieNum; //number of die a player rolls (max 3)
    private Random numGen = new Random();
    private ArrayList<Integer> rollResults = new ArrayList<Integer>();
    
    public Dice(Player p){
        //roll(p);
    }
    
    public ArrayList<Integer> roll(Player p){
        rollResults.clear();
        
        if (p.getChips() <= 0){
            dieNum = 0;
        } else if (p.getChips() >= 4){
            dieNum = 3;
        } else {
            dieNum = p.getChips();
        }
        
        for(int i = 0; i < dieNum; i++){
            rollValue = numGen.nextInt(6) + 1;
            
            switch(rollValue){
                case 1: 
                    //"L"
                    rollResults.add(1);
                    break;
                case 2:
                    //"C"
                    rollResults.add(2);
                    break;
                case 3:
                    //"R"
                    rollResults.add(3);
                    break;
                case 4:
                case 5:
                case 6:
                    rollResults.add(4);
                    //"Dots"
                    break;
                default:
                    System.out.println("Invalid roll");
            }
        }
        
        return rollResults;
        
    }
    
}
    
