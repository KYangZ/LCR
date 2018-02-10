/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;

public class Dice
{
    //int rollValue;
    //  int dieNum; //number of die a player rolls (max 3)
    Random numGen = new Random();
    
    public Dice(){
        //identify the player and how many die they can roll,
        //dieNum = ??
    }
    
    public int roll(){
        String str = "";
        int rollValue;
       
            rollValue = numGen.nextInt(6) + 1;
            
            switch(rollValue){
                case 1: //"L"
                    return 1;
                    
                   
                case 2: //"C"
                    return 2;
                    
                case 3: //"R"
                    return 3;
                   
                case 4:
                case 5:
                case 6: return 4;
                    //"Dots"
                 
                default:
                   
                    System.out.println("Invalid roll"); //ps, the roll should not fail.
                    return 0;
                    
            }
        }
         
    }
    
    /* public void removeDice(){
        
    }
    */
   /*
    public void addDice(){
        
    }*/
 
 
    
