package datebase;
import domain.Task;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DB {
    private static List<Task> tasks = new LinkedList<>();

    private DB() {
    }

    public static void addTask(final Task task) {
        boolean taskExists;
        taskExists = task.stream()
                .anyMatch(taskInDB -> task.getTitle().equals(task.getTitle()));
        if (taskExists) {
            task.add(task);
        }
    }

    public static void deleteTask(final String title) {
        tasks.stream()
                .filter(user -> user.getTitle().equals(title))
                .findFirst();
    }

    public static void print() {
        System.out.println("--------------------------DB--------------------------");
        tasks.forEach(System.out::println);
        System.out.println("------------------------------------------------------");
    }

    public static void sort() {
        Collections.sort(tasks);
    }

    public static List<Task> getTasks() {
        return tasks;
    }

    public static void setTasks(List<Task> tasks) {
        DB.tasks = tasks;
    }

}

