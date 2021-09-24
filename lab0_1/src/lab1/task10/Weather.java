package lab1.task10;

public class Weather {
    private int temperature;
    private String description;
    private int humidity;

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Weather() {
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        final Weather weather = (Weather) obj;
        return this.getTemperature() == weather.getTemperature()
                && (this.getDescription() == weather.getDescription()
                || (this.getDescription() != null && this.getDescription().equals(weather.getDescription())))
                && (this.getHumidity() == weather.getHumidity());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;
        result = prime * result + temperature;
        result = prime * result +
                ((description == null) ? 0 : description.hashCode());
        result = prime * result + humidity;

        return result;
    }


    @Override
    public String toString() {
        return "temperature is: " + getTemperature() + '\n' +
                "description is : " + getDescription() + '\n' +
                "Humidity is : " + getHumidity()+"%" ;
    }
}
