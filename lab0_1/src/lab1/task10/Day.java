package lab1.task10;


public class Day {
    private Weather w = new Weather();
    private String weekDay;

    public Day(final String weekDay, final int temperature, final int humidity, final String description) {
        this.weekDay= weekDay;
        this.w.setTemperature(temperature);
        this.w.setHumidity(humidity);
        this.w.setDescription(description);
    }

    public Weather getWeather() {
        return w;
    }

    public String getNameOfDay() {
        return weekDay;
    }

    @Override
    public String toString() {
        return "week day is : " + getNameOfDay() + '\n' +
                getWeather().toString() + '\n';
    }
}
