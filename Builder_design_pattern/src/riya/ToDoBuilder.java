package riya;

public class ToDoBuilder {
    
    private long id;
    private String title="Todo Title";
    private String description="Todo discreption";
    private String status="pending";
    private boolean completed=false;
    
    public ToDoBuilder withId(long id)
    {
        this.id=id;
        return this;
    }
    
    public ToDoBuilder Title(String title)
    {
        this.title=title;
        return this;
    }
    
    public ToDoBuilder Description(String description)
    {
        this.description=description;
        return this;
    }
    
    public ToDoBuilder Status(String status)
    {
        this.status=status;
        return this;
    }
    
    public ToDoBuilder Completed(boolean completed)
    {
        this.completed=completed;
        return this;
    }
    
    public ToDo build()
    {
        return new ToDo(id,title,description,status,completed);
    }
}
