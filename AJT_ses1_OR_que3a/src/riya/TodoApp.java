package riya;

import java.util.ArrayList;
import java.util.List;

public class TodoApp<T> {
    private final List<TodoItem<T>> todoList = new ArrayList<>();

    public void addTask(T title, T description) {
        TodoItem<T> todoItem = new TodoItem<>(title, description);
        todoList.add(todoItem);
    }

    public void markCompleted(int index) {
        if (index >= 0 && index < todoList.size()) {
            TodoItem<T> todoItem = todoList.get(index);
            todoItem.markCompleted();
        } else {
            System.out.println("Invalid index. Task not found.");
        }
    }

    public void displayPendingTodos() {
        System.out.println("Pending Todos:");
        for (int i = 0; i < todoList.size(); i++) {
            TodoItem<T> todoItem = todoList.get(i);
            if (!todoItem.isCompleted()) {
                System.out.println("Index " + i + ": " + todoItem);
            }
        }
    }

    public void displayCompletedTodos() {
        System.out.println("Completed Todos:");
        for (int i = 0; i < todoList.size(); i++) {
            TodoItem<T> todoItem = todoList.get(i);
            if (todoItem.isCompleted()) {
                System.out.println("Index " + i + ": " + todoItem);
            }
        }
    }

    public static void main(String[] args) {
        TodoApp<String> todoApp = new TodoApp<>();

        // Add new TODO tasks
        todoApp.addTask("Task 1", "Description 1");
        todoApp.addTask("Task 2", "Description 2");
        todoApp.addTask("Task 3", "Description 3");

        // Mark a task as completed
        todoApp.markCompleted(1);

        // Display Pending and Completed Todos
        todoApp.displayPendingTodos();
        todoApp.displayCompletedTodos();
    }
}

