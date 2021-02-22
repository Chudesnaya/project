package domain;

public abstract class AbstractTask implements Task {

    protected String title;
    protected String description;

    public AbstractTask() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public AbstractTask(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public final void install() {
        System.out.print("The task " + title + " is installed");
    }

    public final void delete () {
        System.out.println("The task " + title + " is deleted");
    }
}