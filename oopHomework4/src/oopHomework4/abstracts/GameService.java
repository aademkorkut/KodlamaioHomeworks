package oopHomework4.abstracts;

import oopHomework4.entities.Game;
import oopHomework4.entities.Gamer;

public interface GameService {

	void buyGame(Gamer gamer, Game game);

	void addComments(Gamer gamer, Game game);

}
