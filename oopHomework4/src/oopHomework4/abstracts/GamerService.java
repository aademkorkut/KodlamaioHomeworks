package oopHomework4.abstracts;

import oopHomework4.entities.Gamer;

public interface GamerService {

	void addGamer(Gamer gamer);

	void deleteGamer(Gamer gamer);

	void updateGamer(Gamer gamer);

	void addComment(String message);
}
