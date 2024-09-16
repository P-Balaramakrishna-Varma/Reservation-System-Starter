package flight.reservation.payment;

import flight.reservation.Customer;
import flight.reservation.flight.ScheduledFlight;
import flight.reservation.payment.CreditCard;
import flight.reservation.payment.Paypal;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


public interface PaymentMethodInterface
{
    boolean processPayment(double amount) throws IllegalStateException;
}


