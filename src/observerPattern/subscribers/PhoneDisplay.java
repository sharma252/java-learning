package observerPattern.subscribers;

import observerPattern.observer.Observer;

public class PhoneDisplay implements Observer {
    private final String phone;

    public PhoneDisplay(String phone) {
        this.phone = phone;
    }

    @Override
    public void update(float temperature) {
        System.out.println("Temperature fetching from phone: " + this.phone);
        System.out.println("Temperature outside right now is: " + temperature);
        System.out.println("-------------------------------------------------");
    }
}
