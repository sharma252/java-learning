package observerPattern;

import observerPattern.observer.ObserverStation;
import observerPattern.subscribers.PhoneDisplay;
import observerPattern.subscribers.TvDisplay;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        ObserverStation station = new ObserverStation();

        TvDisplay tvDisplay = new TvDisplay();
        PhoneDisplay phoneDisplay = new PhoneDisplay("Redmi Note 12 Pro");
        PhoneDisplay phoneDisplay2 = new PhoneDisplay("iPhone 14 plus");

        station.registerObserver(tvDisplay);
        station.registerObserver(phoneDisplay);
        station.registerObserver(phoneDisplay2);

        System.out.println("-------------------------------------------------");
        station.setTemperature(23.4F);
        station.setTemperature(24.5F);
    }
}
