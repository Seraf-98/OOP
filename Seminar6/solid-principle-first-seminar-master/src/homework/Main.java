package homework;

public class Main {

    public static void main(String[] args) {
        User user = new User("Bob");
        user.persister.save();
        user.persister.report();

        System.out.println();

        User user1 = new User("Tom");
        user1.persister.report();
        user1.persister.save();
    }
}