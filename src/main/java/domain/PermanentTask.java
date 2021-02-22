package domain;

public class PermanentTask extends AbstractTask {

    private String repeatability;

       public PermanentTask() {
    }

    public static String print() {
        return null;
    }

    public String getRepeatability() {
        return repeatability;
    }

    public void setRepeatability(String repeatability) {
        this.repeatability = repeatability;
    }
    public PermanentTask (String title, String description) {
        super(title, description);
    }

    @Override
    public void deleted() {

    }

    @Override
    public void repeat() {
        System.out.println("You should repeat Task " + title + " for" + repeatability + "times");
    }

    @Override
    public void notifying() {

    }

    @Override
    public void TaskCompleted() {

    }

    @Override
    public String toString() {
        return "PermanentTask" +
                " title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
