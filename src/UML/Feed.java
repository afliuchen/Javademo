package UML;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subjuct{
    private final List<Observer> observers=new ArrayList<>();
    @Override
    public void regis(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyvers(String tweet) {
        observers.forEach(o->o.notify(tweet));
    }
}
