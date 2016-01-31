/**
 * Created by David  on 1/29/2016.
 */
public class Data {


    private double temperature;
    private String businessData;
    private String sportsData;
    private String politicsData;
    private String technologyData;


    private boolean temperatureChanged;
    private boolean businessDataChanged;
    private boolean sportsDataChanged;
    private boolean politicsDataChanged;
    private boolean technologyDataChanged;

    public Data()
    {
        // this will be used to let the observable if a particular data has changed. .
        temperatureChanged = false;
        businessDataChanged = false;
        sportsDataChanged = false;
        politicsDataChanged = false;
        technologyDataChanged = false;
    }

     //inhouse functions toggle whether the data is "new" data or still the same.
    private void tempChanged(){temperatureChanged = !temperatureChanged;}
    private void businessChanged(){businessDataChanged = !businessDataChanged; }
    private void sportsChanged(){ sportsDataChanged = !sportsDataChanged; }
    private void politicsChanged() {politicsDataChanged = !politicsDataChanged;}
    private void technologyChanged(){technologyDataChanged = !technologyDataChanged;}


    // setters to be accessed by the Observable
    public void setTempData(double temperature){this.temperature = temperature; tempChanged();}
    public void setBusinessData(String data){this.businessData = data; businessChanged();}
    public void setSportsData(String data){this.sportsData = data; sportsChanged();}
    public void setPoliticsData(String data) {this.politicsData = data; politicsChanged();}
    public void setTechnologyData(String data){this.technologyData = data; technologyChanged();}




    //getters inHouse functions..
    private boolean hasTempChanged(IWeatherable w){return temperatureChanged;}
    private boolean hasBusinessChanged(IBusinessable b){return businessDataChanged;}
    private boolean hasSportsChanged(ISportsable s){return sportsDataChanged;}
    private boolean hasPoliticsChanged(IPoliticable p){return politicsDataChanged;}
    private boolean hasTechnologyChanged(ITechnologable t){return technologyDataChanged;}

    // getters to be accessed by the Observable.
    public double getTemperature(IWeatherable w){return hasTempChanged(w) ? temperature : (double)-1000;}// Shouldn't be possible for anything to be -1000(not able to use null)
    public String getBusinessData(IBusinessable b){return hasBusinessChanged(b)? businessData : null;}
    public String getSportsData(ISportsable s) {return hasSportsChanged(s)? sportsData : null;}
    public String getPoliticsData(IPoliticable p){return hasPoliticsChanged(p)? politicsData : null;}
    public String getTechnologyData(ITechnologable t){return hasTechnologyChanged(t)? technologyData : null;}




}
