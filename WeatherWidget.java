/**
 * Created by David  on 1/30/2016.
 */
import java.util.Observable;
import java.util.Observer;

public class WeatherWidget implements Observer, DisplayData, IWeatherable {

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
        System.out.println(String.format("WeatherWidget- The Current temperature is %f degrees F\n",temperature));
    }


    public void update(Observable observable, Object o)
    {
        if(observable instanceof AJC)
        {
            AJC ajc = (AJC)observable;
            temperature = ajc.getWeather(this); // must be weatherable to grab data. Maybe make this polymorphic somehow?
            display();
        }
    }
}
