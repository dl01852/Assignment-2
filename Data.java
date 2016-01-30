/**
 * Created by David L on 1/29/2016.
 */
public class Data {


    private double temperature;
    private String businessData;
    private String sportsData;
    private String politicsData;
    private String Technologydata;


    private boolean temperatureChanged;
    private boolean businessDataChanged;
    private boolean sportsDataChanged;
    private boolean politicsDataChanged;
    private boolean technologyDataChanged;

    public Data()
    {
        // this will be used to let the observers know if their data has changed or not.
        temperatureChanged = false;
        businessDataChanged = false;
        sportsDataChanged = false;
        politicsDataChanged = false;
        technologyDataChanged = false;
    }

    // setters(changers in this case)
    public void changeTemp(){temperatureChanged = temperatureChanged == false ?  true : false;}
    public void changeBusiness(){businessDataChanged = businessDataChanged == false ? true : false; }
    public void changeSports(){ sportsDataChanged = sportsDataChanged == false ? true : false; }
    public void changePolitics() {politicsDataChanged = politicsDataChanged == false ? true : false;}
    public void changeTechnology(){technologyDataChanged = technologyDataChanged == false ? true : false;}

    //getters
    private boolean getHasTempChanged(Weatherable w){return temperatureChanged;}
    private boolean getHasBusinessChanged(Businessable b){return businessDataChanged;}
    private boolean getHasSportsChanged(Sportsable s){return sportsDataChanged;}
    private boolean getHasPolticsChanged(){return politicsDataChanged;}
    private boolean getHasTechnologyChanged(){return technologyDataChanged;}

    public double getTemperature(Weatherable w){return getHasTempChanged(w) == true ? temperature : (double)-1000;}// Shouldn't be possible for anything to be -1000..
                                                                                                                    // That vluae is used to say data hasn't changed.
    public String getBusinessData(Businessable b){return getHasBusinessChanged(b) == true ? businessData : null;}
    public String getSportsData(Sportsable s) {return getHasSportsChanged(s) == true ? sportsData : null;}



}
