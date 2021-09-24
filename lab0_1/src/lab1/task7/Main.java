package lab1.task7;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Gregor", "Grinchenko", 22, "grinchenko44@email.com");
        User user2 = new User("Misha", "Harchenko", 32, "harchenko@gmail.com");
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user1));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }
}
