package Concrete;

import Abstract.IGameService;
import Entities.Game;
import Entities.Player;

public class GameManager implements IGameService{

	@Override
	public void sales(Game game, Player player) {
		System.out.println(game.getName() + " su oyuncuya satýldý : " + player.getName());
	}

}
