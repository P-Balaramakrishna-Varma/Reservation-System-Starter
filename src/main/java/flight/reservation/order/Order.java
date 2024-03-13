package flight.reservation.order;

import flight.reservation.Customer;
import flight.reservation.Passenger;

import java.util.List;
import java.util.UUID;

public class Order impliments Subject {

    private final UUID id;
    private double price;
    private boolean isClosed = false;
    private Customer customer;
    private List<Passenger> passengers;
    private List<Observer> observers;

    public Order() {
        this.id = UUID.randomUUID();
        this.observers = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public boolean isClosed() {
        notifyObservers();
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
