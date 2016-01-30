/**
 * Created by David on 1/30/2016.
 */
import java.util.Observable;
import java.util.Observer;

public class WeatherWidget implements Observer, DisplayData, Weatherable {

    Observable subject;
    private double temperature;
    private String data;

    public WeatherWidget(Observable observable)
    {
        subject = observable;
        subject.addObserver(this);
    }

    public void display()
    {
        System.out.println(String.format("The Current temperature is %d degrees F",temperature));
    }


    public void update(Observable observable, Object o)
    {
        if(observable instanceof AJC)
        {
            AJC ajc = (AJC)observable;

        }
    }
}
