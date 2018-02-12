
/**
 * Runs LCR game
 *
 * @author Kory Yang, Kristy Lee
 * @version 20180211
 */

public class LCRGameRunner{
	public static void main(String[] args){
		int player_count = 5;
		int chips_per_player = 5;
		LCR game = new LCR(player_count, chips_per_player);
		System.out.println("Game Results:");
		game.run(); //Game play will output while running
	}
}
