package domain;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.DoubleStream;

public class OneShotTask extends Task implements Serializable {

    private static final long serialVersionUID = 1L;

    public OneShotTask() {
    }

    private Set<Priority> priorities = new HashSet<>();
    private Set<Category> categories = new HashSet<>();

    public OneShotTask(String title, String description, int deadline, boolean installed) {
        super(title, description, deadline, installed);
        priorities.addAll(priorities);
        categories.addAll(categories);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Set<Priority> getPriorities() {
        return priorities;
    }

    public void addPriorities(Priority priority) {
        priorities.add(priority);
    }

    public void deletePriorities(Priority priority) {
        priorities.remove(priority);
    }

    public Set<Category> getCategories() {
        return categories;
    }
    public void addCategories(Category category) {
        categories.add(category);
    }

    public void deleteCategories(Category category) {
        categories.remove(category);
    }

    @Override
    public boolean installed() {
        return false;
    }

    @Override
    public void add(Task task) {

    }

    @Override
    public String toString() {
        return "OneShotTask{" +
                "priorities=" + priorities +
                ", categories=" + categories +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", installed=" + installed +
                '}';
    }

    @Override
    public DoubleStream stream() {
        return null;
    }
}
