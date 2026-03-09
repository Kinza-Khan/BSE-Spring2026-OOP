package Polymorphism;
// compile time
class ShoppingCart {

    double calculateTotal(double price, int quantity){
        return price * quantity;
    }

    double calculateTotal(double price, int quantity, double discount){
        return (price * quantity) - discount;
    }

    double calculateTotal(double price1, double price2){
        return price1 + price2;
    }

}

 class ShoppingSystem {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        System.out.println("Total price: " + cart.calculateTotal(100, 3));

        System.out.println("Total with discount: " + cart.calculateTotal(100, 3, 50));

        System.out.println("Two products total: " + cart.calculateTotal(200, 150));

    }
}