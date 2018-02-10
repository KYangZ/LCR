import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class LCR here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LCR {
    private int player_count;
    private int chips_per_player;
    private ArrayList <Player> players = new ArrayList<Player>();
    private boolean isRunning = true;

    public LCR(){
    
    }
    
    public LCR(int player_count, int chips_per_player){
        
        this.player_count = player_count;
        this.chips_per_player = chips_per_player;
        
    }

    
    public void run(){
        do{
            Scanner in = new Scanner(System.in);
            GameRecord gameRecord = new GameRecord("LCRPlayers.txt");
            //ArrayList players (collection of Player objects) retrieved from gameRecord 
            //and uploaded onto LCR game program
            this.players = gameRecord.retrieveData(); 
            boolean onePlayerRemaining = true; //if true, then the rolling will stop, and record winner
            String[] temp; 
            String str = ""; //temporarily store dice roll results
            ArrayList<Integer> rollResults = new ArrayList<Integer>();
            
          // gameLoops: 
            do{
                
                //player 1-5 seated from left to right, player 1 is on player 5's right
                for (Player player : players){ //for each player 
                    
                    int playerID = player.getID();
                    if (player.getDiceSize() == 0){ //fail fast
                        //do nothing; pass
                    }
                    
                    else{
                    
                        for (int i = 0; i < player.getDiceSize(); i++){ //roll dice
                            
                            str = player.roll();  
                            
                            //fail fast
                            if (str.isEmpty()){
                              break; //move onto next player
                            }
                            
                            temp = str.split(",");
                            for(int j = 0; i < temp.length; i++){
                                rollResults.add(Integer.parseInt(temp[j])); //stores results of roll in ArrayList
                            }
                            
                            
                            for (int k = 0; k < rollResults.size(); k++){
                                
                                
                                switch (rollResults.get(k)){
                                    case 1: //"L"
                                        l(playerID);
                                    
                                    case 2: //"C"
    
                                        c(playerID);
                                    
                                    case 3: //"R"
                                        
                                        r(playerID);
                                    
                                
                                }
                                
                                
                                
                            }
                            
                            
                            
                            for (int m = 0; m < rollResults.size(); m++){ //remove elements of the array list, leave array empty for next dice roll
                                rollResults.remove(rollResults.size() - 1);
                            }
                            
                            
                            
                        }
                        
                        
                    }
                    
                }
                
                
                
                
            } while(!onePlayerRemaining);
            
            
            
            
            do{
                System.out.println("Play again? Type 'y' to play again or 'n' to stop playing the game");
                if (in.next() == "y"){
                    isRunning = true;
                }
                else if (in.next() == "n"){
                    isRunning = false;
                }
            }while (in.next() != "y" && in.next() != "n");
             
          
        } while (isRunning);
        
    }
    
    public void l(int playerID){
        
        int indexPlayerID = playerID - 1; //the position of the player in the ArrayList is the difference playerID (his actual ID) - 1 
        
        players.get(indexPlayerID).removeChips();
        
        if (playerID == 1){
            players.get(4).addChips(); //give chip to player 5, who is seated on player 1's left
            
        }
        
        
        else{   
            players.get(indexPlayerID - 1).addChips(); //give chip to player on left
    
        }
        
        
    }
    
    public void c(int playerID){
        
    }
    
    public void r(int playerID){
        
        
        int indexPlayerID = playerID - 1; //the position of the player in the ArrayList is the difference playerID (his actual ID) - 1 
        
        players.get(indexPlayerID).removeChips();
        
        if (playerID == 5){
            players.get(0).addChips(); //give chip to player 1, who is seated on player 5's right
            
        }
        
        
        else{   
            players.get(indexPlayerID + 1).addChips(); //give chip to player on right
            
        }
        
    }
    
    
}
