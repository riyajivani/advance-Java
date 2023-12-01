package riya;

public class ToDoDirector {

    ToDo[] todos = new ToDo[100];
    
    public ToDoDirector()
    {
        todos[0]=new ToDoBuilder().withId(1)
                .Title("Login")
                .Description("do login here")
                .Status("started")
                .Completed(false)
                .build();
        
        todos[1] = new ToDoBuilder().withId(2)
                .build();
    }
    
    public void print()
    {
        for(int i=0;i<todos.length;i++)
        {
            if(todos[i]!=null)
            System.out.println(todos[i]);
        }
    }
}
