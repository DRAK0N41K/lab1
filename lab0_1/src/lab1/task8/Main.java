package lab1.task8;

public class Main {
    public static void main(String[] args) {
        final CustomDouble customDouble = new CustomDouble(1, 0.5);
        final CustomDouble customDouble1 = new CustomDouble(3, 0.3);

        System.out.println("First= " + customDouble);
        System.out.println("Second= " + customDouble1);
        System.out.println("Sum :" + customDouble.sum(customDouble1));
        System.out.println("Difference : " + customDouble.dif(customDouble1));
        System.out.println("Comparison: ");
        customDouble.comparison(customDouble1);
        System.out.println(customDouble.equals(customDouble1));
        System.out.println(customDouble.hashCode());
        System.out.println(customDouble1.hashCode());
    }
}
