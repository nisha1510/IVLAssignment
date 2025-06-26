package core_java_day11;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String name;
    private Set<String> interests;

    public User(String name) {
        this.name = name;
        this.interests = new HashSet<>();
    }

    public void addInterest(String interest) {
        boolean added = interests.add(interest);
        if (added) {
            System.out.println(interest + " added to " + name + "'s interests.");
        } else {
            System.out.println(interest + " is already in the list!");
        }
    }

    public void showInterests() {
        System.out.println(name + "'s interests: " + interests);
    }

    public static void main(String[] args) {
        User user = new User("Nisha");

        user.addInterest("Reading");
        user.addInterest("Cooking");
        user.addInterest("Traveling");
        user.addInterest("Cooking"); // Duplicate

        user.showInterests();
    }
}
