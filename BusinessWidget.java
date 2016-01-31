/**
 * Created by David on 1/30/2016.
 */

import java.util.Observable;
import java.util.Observer;

public class BusinessWidget implements IBusinessable, Observer, DisplayData {

    private Observable subject;
    private String businessData;

    public BusinessWidget(Observable observable)
    {
        subject = observable;
        subject.addObserver(this);
    }

    public void display()
    {
        System.out.println(String.format("BusinessWidget- %s\n", businessData));
    }

    public void update(Observable obs, Object object)
    {
        if(obs instanceof AJC)
        {
            AJC ajc = (AJC) obs;
            businessData = ajc.getBusiness(this);
            display();
        }
    }
}
