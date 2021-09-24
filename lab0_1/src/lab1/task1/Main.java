package lab1.task1;

public class Main {
    public static void main(String[] args) {
        final String[] array = {"water", "boils", "at", "100", "degrees"};
        sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void sort(final String[] array) {
        for (int i = 1; i < array.length; i++) {
            String tmp = array[i];
            int j = i - 1;
            while (j >= 0 && tmp.length() > array[j].length()) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;


        }


    }
}
