public class Client extends Campaign {
private String companyAddress;
private String contactName;
public String companyInformation; 
public String contactEmail; 

 
 
 
public String getClientCompany(){ 
	String companyInformation="Campaign Name :"+getTitle()+", Campaign Start Date :" +getCampaignStartDate() + 	", Campaign Finish Date : " +getCampaignFinishDate()+", Estimated Cost : "+ getEstimatedCost() ;
    return companyInformation;
}
 
 
public void addNewCampaigns() {

 
 
 }
}
