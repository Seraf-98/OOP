package homework;

public class Persister {
    public User user;

    public Persister(User user) {
        this.user = user;
    }

    public void save() {
        System.out.println("Save user: " + user.getName());
    }

    public void report() {
        System.out.println("Report for user: " + user.getName());
    }

}
