/**
 * Created by David on 1/30/2016.
 */
import java.util.Observable;
import java.util.Observer;

public class PoliticsWidget implements Observer, DisplayData, IPoliticable {

    private Observable subject;
    private String polticsData;

    public PoliticsWidget(Observable observable)
    {
        subject = observable;
        subject.addObserver(this);
    }

    public void display()
    {
        System.out.println(String.format("PolticalWidget- %s\n", polticsData));
    }

    public void update(Observable obs, Object o)
    {
        if(obs instanceof AJC)
        {
            AJC ajc = (AJC) obs;
            polticsData = ajc.getPolitics(this); // after doing this multiple times..
            display();                           // i realize that a class doesn't need to be
                                                // Politicable to grab politics data but whatevs, doesn't hurt.
                                                // just more encapsulation i guess and flexibilty.
        }
    }
}
