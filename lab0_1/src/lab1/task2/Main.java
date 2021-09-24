package lab1.task2;

public class Main {
    public static void main(String[] args) {
        String[] array = {"water", "boils", "at", "100", "degrees"};
        System.out.println("The number of specific character: " + search(array, 'a'));
    }

    public static int search(String[] array, char count) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == count)
                    result++;
            }
        }
        return result;
    }
}
