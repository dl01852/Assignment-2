/**
 * Created by David on 1/29/2016.
 */
import java.util.Observable;
import java.util.Observer;

/*
    Observer may want to have a boolean to let them know
    if they have the most recent data already.
    if false, retrieve new data.

 */
public class AJC extends Observable {

    private Data data;

    public AJC() {
        data = new Data();
    }

    // get the data from the data object.
    public double getWeather(IWeatherable w) {return data.getTemperature(w);}
    public String getSports(ISportsable s) {return data.getSportsData(s);}
    public String getBusiness(IBusinessable b) {return data.getBusinessData(b);}
    public String getPolitics(IPoliticable p) {return data.getPoliticsData(p);}
    public String getTechonlogy(ITechnologable t) {return data.getTechnologyData(t);}


    // set the data to the data object.
    public void setWeather(double temperature){data.setTempData(temperature);}
    public void setSportsData(String sportsData){this.data.setSportsData(sportsData);}
    public void setBusinessData(String businessData){this.data.setBusinessData(businessData);}
    public void setPoliticalData(String politicalData){this.data.setPoliticsData(politicalData);}
    public void setTechnologyData(String technologyData){this.data.setTechnologyData(technologyData);}


    public void nextDayNews(double temperature, String sportsData, String businessData, String politicalData, String technologyData)
    {
        setWeather(temperature);
        setSportsData(sportsData);
        setBusinessData(businessData);
        setPoliticalData(politicalData);
        setTechnologyData(technologyData);
        allDataChanged();
    }

    private void allDataChanged()
    {
        setChanged();
        notifyObservers();
    }


}
