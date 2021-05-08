package oopHomework4.concrete;

import oopHomework4.abstracts.CampaignService;
import oopHomework4.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaing(Campaign campaign) {
		// Ýþlem Kodlarý

		System.out.println(campaign.getName() + "Campaign price : " + campaign.getAfterCampaingPrice());

	}

	@Override
	public void deleteCampaing(Campaign campaign) {
		// Ýþlem Kodlarý

		System.out.println(campaign.getName() + "Campaign deleted ");

	}

	@Override
	public void updateCampaing(Campaign campaign) {
		// Ýþlem Kodlarý

		System.out.println(campaign.getName() + "Campaign updated new price : " + campaign.getAfterCampaingPrice());
	}

}
