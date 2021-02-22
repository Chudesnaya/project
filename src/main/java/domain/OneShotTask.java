package domain;

public class OneShotTask extends AbstractTask{

    private String deadline;

    public OneShotTask() {
    }

    public OneShotTask (String title, String description) {
        super(title, description);
    }

    @Override
    public void deleted() {

    }

    @Override
    public void repeat() {

    }

    @Override
    public void notifying () {
        System.out.println("You should complete Task " + title + " by" + deadline + "times");
    }

    @Override
    public String toString() {
        return "OneShotTask{" +
                "deadline='" + deadline + '\'' +
                '}';
    }

    @Override
    public void TaskCompleted() {

    }
}
