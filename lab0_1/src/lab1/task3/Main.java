package lab1.task3;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        char[] b = {'a', 'b', 'c', 'd', 'f'};

        System.out.println(merge(a, b));

    }

    public  static String merge(int[] a, char[] b) {
        String res = "";
        int i;
        for (i = 0; i < Math.max(a.length, b.length); i++) {
            if (i < a.length) {
                res += a[i];
            }
            if (i < b.length) {
                res += b[i];
            }
        }
        return res;
    }
}
