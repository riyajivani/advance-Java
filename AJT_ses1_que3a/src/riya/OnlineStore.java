package riya;

// OnlineStore.java
public class OnlineStore 
{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) 
    {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) 
    {
        if (paymentStrategy != null)
        {
            paymentStrategy.makePayment(amount);
        } 
        else
        {
            System.out.println("Payment strategy not set.");
        }
    }

    public static void main(String[] args) 
    {
        OnlineStore store = new OnlineStore();

        // Test scenario 1: Payment using Credit Card
        store.setPaymentStrategy(amount -> new CreditCard().makePayment(amount));
        store.processPayment(100.00);

        // Test scenario 2: Payment using UPI
        store.setPaymentStrategy(amount -> new UPI().makePayment(amount));
        store.processPayment(50.00);

        // Test scenario 3: Payment using Debit Card
        store.setPaymentStrategy(amount -> new DebitCard().makePayment(amount));
        store.processPayment(75.50);
    }
}
