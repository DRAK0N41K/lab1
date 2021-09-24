package lab1.task9;
public class Main {
    public static void main(String[] args) {
        Calculate c = new Calculate();

        System.out.println(c.calculate1(30,15,'/'));
        System.out.println(c.calculate2(13.9, 2.1, '+'));
        System.out.println(c.calculate2(30.0, 10.5, '-'));

    }
}
