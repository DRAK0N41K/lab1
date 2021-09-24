package lab1.task11;

public class Taxist extends Person {
    private String ID;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Taxist(String ID, String name) {
        super(name);
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "\n" + "Driver: " + "\n" +
                "ID" + ID + ", name: " + name;
    }
}