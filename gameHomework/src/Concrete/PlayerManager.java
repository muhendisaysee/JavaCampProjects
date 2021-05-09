package Concrete;

import Abstract.IPlayerService;
import Entities.Player;

public class PlayerManager implements IPlayerService{

	@Override
	public void create(Player player) {
		System.out.println("Player add : "+ player.getName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Player delete : "+player.getName());
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Player update : "+player.getName());
		
	}

}
