/**
 * Created by David on 1/30/2016.
 */
import java.util.Observable;
import java.util.Observer;

public class SportsTechWidget implements Observer, DisplayData,ITechnologable, ISportsable {

    private String techData;
    private String sportsData;

    public SportsTechWidget(Observable observable)
    {
        observable.addObserver(this);
    }

    public void display()
    {
        System.out.println(String.format("SportsTech Widget - \nSports News: %s \nTech News: %s\n",sportsData,techData));
    }

    public void update(Observable obs, Object o)
    {
        if(obs instanceof AJC)
        {
            AJC ajc = (AJC) obs;
            techData = ajc.getTechonlogy(this);
            sportsData = ajc.getSports(this);
            display();
        }
    }
}
