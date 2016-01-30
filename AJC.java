/**
 * Created by David on 1/29/2016.
 */
import java.util.Observable;

/*
    Observer may want to have a boolean to let them know
    if they have the most recent data already.
    if false, retrieve new data.

 */
public class AJC extends Observable {

    private Data data;

    public AJC()
    {
        data = new Data();
        // constructor.
    }

    public double getWeather(Weatherable w)
    {
        // return the weather...
       return data.getTemperature(w);
    }
    public void getSports()
    {
        // return info about sports..
    }

    public void getBusiness()
    {
        // return info about Business shit... maybe Stock updates?

    }

    public void getPolitics()
    {
        // return some info about Politics
    }
    public void Technology()
    {
        // return some info about technology...
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }
}
