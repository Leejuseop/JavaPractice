package customer;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer();
        Buy buyer = customer;
        Sell seller = customer;

        customer.buy();
        customer.sell();

        buyer.order();
        seller.order();
        customer.order();
    }
}
