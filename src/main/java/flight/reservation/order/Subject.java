package src.main.java.flight.reservation.order;
import flight.reservation.order.Observer;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}