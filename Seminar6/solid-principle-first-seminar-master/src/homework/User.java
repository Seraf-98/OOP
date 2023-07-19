package homework;

public class User {
    private final String name;
    public final Persister persister;

    public User(String name) {
        this.name = name;
        persister = new Persister(this);
    }

    public String getName() {
        return name;
    }

}
