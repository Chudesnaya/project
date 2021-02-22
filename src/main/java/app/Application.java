package app;

import domain.Category;
import domain.PermanentTask;
import domain.Priority;
import user.User;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Set<Priority> priorities = new HashSet<>();
        Set<Category> categories = new HashSet<>();

        User newUserOne = new User();

        PermanentTask newPermanentTaskOne = new PermanentTask("Hygienic", "Clean teeth, take a shower");
        priorities.add(Priority.HIGH);
        categories.add(Category.SELFCARE);


        System.out.println(newPermanentTaskOne);
    }
}
