package gameHomework;

import java.time.LocalDate;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		Campaign campaign = new Campaign(1, "1 ay deneme" , "30 gun");
		CampaignManager campaignManager  = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		/*********************************************/
		
		Player player = new Player(1 , "123456789098" , "Ayse" , "Ozavci" , LocalDate.of(1998, 1, 24));
		PlayerManager playerManager= new PlayerManager();
		playerManager.create(player);
		playerManager.delete(player);
		playerManager.update(player);
		
		/*********************************************/
		
		Game game = new Game(1 , "PubG", "100");
		GameManager gameManager = new GameManager();
		gameManager.sales(game, player);
		
		
	}

}
