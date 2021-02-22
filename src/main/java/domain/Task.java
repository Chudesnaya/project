package domain;

public interface Task {

    void install();

    void deleted();

    void repeat();

    void notifying();

    default void TaskCompleted() {
        System.out.println("Completed");
    }

}