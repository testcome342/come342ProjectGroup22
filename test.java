public class test  {

	
	
	public static void main(String[] args) {

		Campaign camp1 = new Campaign();
		Client cli1 = new Client();
		
		camp1.createCampaign();
		camp1.setTitle("342 Sýnýf Bulusmasý");
		camp1.setCampaignStartDate("20 Eylul");
		camp1.setCampaignFinishDate("30 Eylul");
		camp1.setEstimatedCost(350);
		
		
		String campaignDetails = cli1.getClientCompany();
		System.out.println(campaignDetails);
		
		
		System.out.println(camp1.getTitle());
		System.out.println(camp1.getCampaignStartDate());
		System.out.println(camp1.getCampaignFinishDate());
		System.out.println(camp1.getEstimatedCost());
		
		
		
		
		
		
	}

	
	
	
}