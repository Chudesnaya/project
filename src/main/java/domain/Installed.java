package domain;

public interface Installed {

    void uninstall();

    boolean installed();

    void add(Task task);

}
