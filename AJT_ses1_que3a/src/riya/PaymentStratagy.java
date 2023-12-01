package riya;

// PaymentStrategy.java (Functional Interface)
@FunctionalInterface
interface PaymentStrategy {
    void makePayment(double amount);
}
