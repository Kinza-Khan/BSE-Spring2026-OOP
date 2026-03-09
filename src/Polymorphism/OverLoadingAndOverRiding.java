package Polymorphism;
//method Overloading and method overriding
class Payment {
    // Overloaded method (Compile Time Polymorphism)
    double calculateFee(double amount){
        return amount * 0.02;
    }
    double calculateFee(double amount, double extraCharge){
        return (amount * 0.02) + extraCharge;
    }
    void processPayment(double amount){
        System.out.println("Processing payment of: " + amount);
    }
}
class CreditCardPayment extends Payment {
    // Method Overriding (Runtime Polymorphism)
    void processPayment(double amount){
        // Calling parent class method
        super.processPayment(amount);
        double fee = super.calculateFee(amount);
        System.out.println("Credit Card Fee: " + fee);
        System.out.println("Credit card payment completed");
    }
}
 class PaymentSystem {
    public static void main(String[] args) {
        Payment p;
        p = new CreditCardPayment();
        p.processPayment(5000);
        // Demonstrating method overloading
        Payment obj = new Payment();
        System.out.println("Normal Fee: " + obj.calculateFee(5000));
        System.out.println("Fee with extra charge: " + obj.calculateFee(5000, 100));
    }
}