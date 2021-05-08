package oopHomework4.concrete;

import oopHomework4.abstracts.GameService;
import oopHomework4.entities.Game;
import oopHomework4.entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void buyGame(Gamer gamer, Game game) {
		System.out.println(gamer.getUserName() + " Bought the game : " + game.getName());

	}

	@Override
	public void addComments(Gamer gamer, Game game) {
		System.out.println(gamer.getUserName() + "," + game.getName() + " Comment on the game : " + gamer.getComment());

	}

}
