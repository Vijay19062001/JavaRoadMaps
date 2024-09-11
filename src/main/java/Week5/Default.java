package week5;

interface PaymentProcessor {
    void processPayment();

    // New method added with default implementation
    default void processRefund() {
        System.out.println("Default refund processing");
    }
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }
}

public class Default {
    public static void main(String[] args) {
        PaymentProcessor processor = new CreditCardProcessor();
        processor.processRefund();
        processor.processPayment();      // Calls the overridden method

    }
}


