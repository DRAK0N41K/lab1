package lab1.task11;

public class Order {
    private int orderNumber;
    private String orderTime;
    private Taxist taxist;
    private Client client;
    private Taxi taxi;

    public Order(int orderNumber, String orderTime, Client client, Taxi taxi, Taxist taxist) {
        this.orderNumber = orderNumber;
        this.orderTime = orderTime;
        this.client = client;
        this.taxi = taxi;
        this.taxist = taxist;
    }


    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi Taxi) {
        this.taxi = taxi;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client Client) {
        this.client = client;
    }

    public Taxist getTaxist() {
        return taxist;
    }

    public void setTaxist(Taxist Taxist) {
        this.taxist = taxist;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "Order " +
                "orderNumber: " + orderNumber +
                client + taxist + taxi;
    }
}
