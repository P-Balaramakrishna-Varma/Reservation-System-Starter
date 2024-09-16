package flight.reservation.payment;
// package flight.reservation.order;
import flight.reservation.payment.CreditCard;
import java.util.Date;

public class CreditCardPayment implements PaymentMethodInterface {
    private CreditCard creditCard;

    public CreditCardPayment(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public CreditCardPayment(String number, Date expirationDate, String cvv) {
        this.creditCard = new CreditCard(number, expirationDate, cvv);
    }

    @Override
    public boolean processPayment(double amount) throws IllegalStateException {
        if (creditCard == null || !creditCard.isValid()) {
            throw new IllegalStateException("Payment information is not set or not valid.");
        }
        System.out.println("Paying " + amount + " using Credit Card.");
        double remainingAmount = creditCard.getAmount() - amount;
        if (remainingAmount < 0) {
            System.out.printf("Card limit reached - Balance: %f%n", remainingAmount);
            throw new IllegalStateException("Card limit reached");
        }
        creditCard.setAmount(remainingAmount);
        return true;
    }
}
