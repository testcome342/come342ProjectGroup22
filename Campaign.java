public class Campaign {

static String title;
static String campaignStartDate;
static String campaignFinishDate;
static int estimatedCost;

public void createCampaign() {
}
public void setTitle(String title) {
this.title=title;
}
public static String getTitle(){
return title;
}
public void setCampaignStartDate(String campaignStartDate) {
this.campaignStartDate=campaignStartDate;
}
public static String getCampaignStartDate(){
return campaignStartDate;
}
public void setCampaignFinishDate(String campaignFinishDate) {
this.campaignFinishDate=campaignFinishDate;
}
public static String getCampaignFinishDate(){
return campaignFinishDate;
}
public void setEstimatedCost(int estimatedCost) {
this.estimatedCost=estimatedCost;
}
public int getEstimatedCost(){
return estimatedCost;
   }
}
