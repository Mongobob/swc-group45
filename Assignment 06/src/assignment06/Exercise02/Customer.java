package assignment06.Exercise02;

public abstract class Customer {
    abstract public void sellProduct();
    abstract public void buyProduct();
    abstract public void addToCart(Product product);
    abstract public void removeFromCart(Product product);
    abstract public void addPaymentmethod(Payment payment);
    abstract public void removePaymentmethod(Payment payment);
    abstract public String getName();



}
