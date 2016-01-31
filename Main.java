import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by David on 1/30/2016.
 */
public class Main {

    public static void main(String[] args)
    {
        AJC ajc = new AJC();
        List<Observer> observersList = new ArrayList<>();
        observersList.add(new WeatherWidget(ajc));
        observersList.add(new BusinessWidget(ajc));
        observersList.add(new PoliticsWidget(ajc));
        observersList.add(new SportsTechWidget(ajc));


        String sportsData = "Golden State Warriors are on track to chasing History";
        String businessData = "The Dow is up 2.45%";
        String politics = "Marco Rubio hopes to finish strong in Iowa";
        String technolgoy = "Apple recalls wall plug adapter";
        double weather = (double)53;

        ajc.nextDayNews(weather,sportsData,businessData,politics,technolgoy);


    }
}
