






/**
 * Write a description of class LCR here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class LCR {
    private int player_count;
    private int chips_per_player;
    private ArrayList <Player> players = new ArrayList<Player>();
    private boolean isRunning = true;
    private int turns = 1;

    public LCR(){
    
    }
    
    public LCR(int player_count, int chips_per_player){
        
        this.player_count = player_count;
        this.chips_per_player = chips_per_player;
        
    }

    
    public void run(){
        while (isRunning) {

            GameRecord gameRecord = new GameRecord("LCRPlayers.txt");
            //ArrayList players (collection of Player objects) retrieved from gameRecord 
            //and uploaded onto LCR game program
            this.players = gameRecord.retrieveData(); 
            boolean onePlayerRemaining = false; //if true, then the rolling will stop, and record winner
            ArrayList<Integer> rollResults = new ArrayList<Integer>();
            
            turns = 1;
            
            // gameLoops: 
            do{
                //player 1-5 seated from left to right, player 1 is on player 5's right
                for (Player player : players){ //for each player 
                    Dice die = new Dice(player);

                    rollResults = die.roll(player);
                    
                    System.out.println("Turn " + turns);

                    for(Integer result : rollResults){
                        switch(result){
                            case 1:
                                l(player.getID());
                                break;
                            case 2:
                                c(player.getID());
                                break;
                            case 3:
                                r(player.getID());
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Error");
                                break;
                        }
                    }
                    
                    printPlayerStates();
                    
                    for(Player p : players){
                        if(checkWin(p)){
                            onePlayerRemaining = true;
                            break;
                        }
                    }
                    
                    if(onePlayerRemaining){
                        break;
                    } else {
                        turns++;
                    }
                }
            } while(!onePlayerRemaining);

            while (isRunning) {
                System.out.println("Play again? Type 'y' to play again or 'n' to stop playing the game");
                Scanner in = new Scanner(System.in);
                if (in.nextLine().equals("y")){
                    isRunning = true;
                    for(Player p : players) {
                        p.setChips(5);
                    }
                    run();
                    onePlayerRemaining = false;
                } else if (in.nextLine().equals("n")){
                    isRunning = false;
                    System.out.println("Goodbye!");
                    in.close();
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            } 
        } 
        
    }
    
    public void l(int playerID){
        players.get(playerID).removeChips();
        if (playerID == 0){
            players.get(4).addChips(); //give chip to player 5, who is seated on player 1's left            
        } else{   
            players.get(playerID - 1).addChips(); //give chip to player on left    
        }
    }
    
    public void c(int playerID){
        players.get(playerID).removeChips();
        //chips go in the center, to no one
    }
    
    public void r(int playerID){
        players.get(playerID).removeChips();
        if (playerID == 4){
            players.get(0).addChips(); //give chip to player 1, who is seated on player 5's right          
        } else{   
            players.get(playerID + 1).addChips(); //give chip to player on right          
        }        
    }
    
    public boolean checkWin(Player p){
        boolean win = false;
        int chipSum = 0;
        
        if(p.getChips() <= 0){
            win = false;
        } else {
            for(Player a : players){
                if(a.getID() == p.getID()){
                    //do nothing
                } else {
                    chipSum += a.getChips();
                }
            }
            
            if(chipSum <= 0 && p.getChips() > 0){
                win = true;
            }
            
        }
        
        if(win){
            System.out.println(p.getName() + " won after " + turns + " turns.");
        }
        
        return win;
    }
    
    private void printPlayerStates(){
        for(Player p : players){
            System.out.println(p.getName() + ": " + p.getChips() + " chips");
        }
        System.out.println();
    }
}
