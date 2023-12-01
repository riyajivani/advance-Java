package riya;

public class TodoItem<T> {
    private final T title;
    private final T description;
    private boolean isCompleted;

    public TodoItem(T title, T description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false; // Initially, tasks are pending
    }

    public T getTitle() {
        return title;
    }

    public T getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Description: " + description;
    }
}

