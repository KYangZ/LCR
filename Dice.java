
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;

public class Dice
{
    int rollValue;
    int dieNum; //number of die a player rolls (max 3)
    Random numGen = new Random();
    
    public Dice(Player p){
        //identify the player and how many die they can roll,
        //dieNum = ??
    }
    
    private void roll(){
        for(int i = 0; i < dieNum; i++){
            rollValue = numGen.nextInt(6) + 1;
            
            switch(rollValue){
                case 1: 
                    //"L"
                    break;
                case 2:
                    //"C"
                    break;
                case 3:
                    //"R"
                    break;
                case 4:
                case 5:
                case 6:
                    //"Dots"
                    break;
                default:
                    System.out.println("Invalid roll");
            }
        }
    }
    
    
}
