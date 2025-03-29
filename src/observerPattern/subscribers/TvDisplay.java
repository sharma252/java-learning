package observerPattern.subscribers;

import observerPattern.observer.Observer;

public class TvDisplay implements Observer {

    @Override
    public void update(float temperature){
        System.out.println("Temperature fetching from Tv: ");
        System.out.println("Temperature fetched from tv is: " + temperature);
        System.out.println("-------------------------------------------------");
    }

}
