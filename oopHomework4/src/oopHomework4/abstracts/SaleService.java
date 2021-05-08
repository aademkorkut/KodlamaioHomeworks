package oopHomework4.abstracts;

import oopHomework4.entities.Campaign;
import oopHomework4.entities.Game;
import oopHomework4.entities.Gamer;

public interface SaleService {

	void sale(Game game, Gamer gamer);

	void campaignSale(Game game, Gamer gamer, Campaign campaign);
}
