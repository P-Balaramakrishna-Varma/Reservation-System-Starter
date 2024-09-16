package flight.reservation.payment;
// package flight.reservation.order;

import flight.reservation.Customer;
import flight.reservation.flight.ScheduledFlight;
import flight.reservation.payment.CreditCard;
import flight.reservation.payment.Paypal;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class PaypalPayment implements PaymentMethodInterface
{
    private String email;
    private String password;
    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }
    @Override
    public boolean processPayment(double amount) throws IllegalStateException {
        if (!email.equals(Paypal.DATA_BASE.get(password))) {
            throw new IllegalStateException("PayPal information is not set or not valid.");
        }
        System.out.println("Paying " + amount + " using PayPal.");
        return true;
    }
}