package lab1.task5;


public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        matrix.read();
        System.out.println("Matrix:");
        matrix.display();
        System.out.println("Transported:");
        matrix.transposition();

    }
}
