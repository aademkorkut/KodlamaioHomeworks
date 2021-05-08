package oopHomework4;

import oopHomework4.abstracts.GamerService;
import oopHomework4.adapter.EdevletPersonCheckAdapter;
import oopHomework4.concrete.CampaignManager;
import oopHomework4.concrete.GameManager;
import oopHomework4.concrete.GamerManager;
import oopHomework4.concrete.SaleManager;
import oopHomework4.entities.Campaign;
import oopHomework4.entities.Game;
import oopHomework4.entities.Gamer;

public class Main {

	public static void main(String[] args) {

		Game game = new Game(5, "Counter Strike Global Offensive", 70);
		Gamer gamer = new Gamer(1, "Adem", "Korkut", "11111111", 1995, "aKorkut", "Excellent game..!");
		Campaign campaing = new Campaign(0, 5, "Summer Sale...! ", 70, 50);
		Campaign campaing2 = new Campaign(1, 5, "Winter Sale...! ", 70, 70);

		System.out.println("**********OUTPUT************");

		GamerService gamerManager = new GamerManager(new EdevletPersonCheckAdapter());
		gamerManager.addGamer(gamer);
		gamerManager.addComment(gamer.getComment());
		System.out.println("----------------------------");

		GameManager gameManager = new GameManager();
		gameManager.buyGame(gamer, game);
		System.out.println("----------------------------");

		CampaignManager campaingManager = new CampaignManager();
		campaingManager.addCampaing(campaing);
		campaingManager.updateCampaing(campaing2);
		System.out.println("----------------------------");

		SaleManager saleManager = new SaleManager();
		saleManager.sale(game, gamer);
		saleManager.campaignSale(game, gamer, campaing);
		campaing.getAfterCampaingPrice();
		System.out.println("----------------------------");
	}

}
