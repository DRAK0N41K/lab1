package lab1.task11;

public class Main {
    public static void main(String[] args) {
        Taxist taxist = new Taxist("34567", "Oleg Gorbachev");
        Taxi taxi = new Taxi(3456, "BMW", "white");
        Client client = new Client("0987654338", "Vika");
        Taxist taxist1 = new Taxist("6789", "Gregor Gorbachev");
        Taxi taxi1 = new Taxi(7778, "opel", "blue");
        Client client1 = new Client("0987654327", "Olga");

        Order order1 = new Order(123, "15:43", client, taxi, taxist);
        Order order2 = new Order(678, "12:13", client1, taxi, taxist);
        Order order3 = new Order(980, "10:03", client, taxi1, taxist1);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);


    }
}
