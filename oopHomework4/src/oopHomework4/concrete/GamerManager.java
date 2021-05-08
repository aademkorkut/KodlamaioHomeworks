package oopHomework4.concrete;

import oopHomework4.abstracts.GamerService;
import oopHomework4.adapter.GamerCheckService;
import oopHomework4.entities.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void addGamer(Gamer gamer) {
		if (gamerCheckService.checkRealPerson(gamer)) {
			System.out.println(gamer.getUserName() + " Registration Created ");
		}

	}

	@Override
	public void deleteGamer(Gamer gamer) {
		System.out.println(gamer.getUserName() + " Registration Deleted ");

	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getUserName() + " Registration Updated ");

	}

	@Override
	public void addComment(String message) {
		System.out.println("Comment on the game  : " + message);

	}

}
