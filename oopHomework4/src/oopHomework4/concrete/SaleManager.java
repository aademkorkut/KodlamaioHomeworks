package oopHomework4.concrete;

import oopHomework4.abstracts.SaleService;
import oopHomework4.entities.Campaign;
import oopHomework4.entities.Game;
import oopHomework4.entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getName() + " Saled to " + gamer.getUserName() + " Price : " + game.getPrice());
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + " Saled to " + gamer.getUserName() + " with " + campaign.getName()
				+ " Campaign price : " + campaign.getAfterCampaingPrice());
	}

}
