package lab1.task11;

public class Client extends Person {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    Client(String phoneNumber, String name) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\n" + "Client:" + "\n" +
                "phoneNumber number" + phoneNumber + ", name: " + name;
    }
}
