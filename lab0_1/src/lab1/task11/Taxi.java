package lab1.task11;

public class Taxi {
    private int number;
    private String color;
    private String type;

    Taxi(int number, String type, String color) {
        this.number = number;
        this.type = type;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Taxi Taxi = (Taxi) obj;
        return number == Taxi.number
                && (color == Taxi.color
                || (color != null && color.equals(Taxi.getColor()))) && (type == Taxi.type
                || (type != null && type.equals(Taxi.getType())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result +
                ((color == null) ? 0 : color.hashCode());
        result = prime * result +
                ((type == null) ? 0 : type.hashCode());
        result = prime * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "\n" + "Taxi: " + "\n" +
                ", number of Taxi: " + number +
                ", color of Taxi: " + color +
                ", type of Taxi : " + type;
    }
}
