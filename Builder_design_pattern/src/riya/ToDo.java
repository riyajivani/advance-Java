package riya;

public class ToDo {
    private long id;
    private String title;
    private String description;
    private String status;
    private boolean completed;
    
    public ToDo(long id)
    {
        this.id=id;
    }

    public ToDo(long id, String title, String description, String status, boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "ToDo{" + "id=" + id + ", title=" + title + ", description=" + description + ", status=" + status + ", completed=" + completed + '}';
    }
   
}