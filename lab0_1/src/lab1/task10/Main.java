package lab1.task10;

public class Main {
    public static void main(final String[] args) {
        final Day[] d = new Day[7];

        d[0] = new Day("Monday", 21, 3, "Sunny");
        d[1] = new Day("Tuesday", 15, 45,  "Mostly cloudy");
        d[2] = new Day("Wednesday", 18, 78, "Sunny");
        d[3] = new Day("Thursday", 9, 98,  "Rainy");
        d[4] = new Day("Friday",16, 88, "Mostly cloudy");
        d[5] = new Day("Saturday", 13, 56,  "Rainy");
        d[6] = new Day("Sunday", 14, 45, "Mostly cloudy");

        for (Day day : d) {
            System.out.println(day);
        }

    }
}
