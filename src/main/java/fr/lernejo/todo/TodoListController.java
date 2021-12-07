package fr.lernejo.todo;

import fr.lernejo.todo.TodoEntity;
import fr.lernejo.todo.TodoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@RestController
public class TodoListController {
    private final TodoRepository repository;

    public TodoListController(TodoRepository repo) {
        this.repository = repo;
    }

    @PostMapping("/api/todo")
    public void addTodo(@RequestBody TodoEntity newTodo) {
        this.repository.save(newTodo);
    }

    @GetMapping("/api/todo")
    public Iterable<TodoEntity> getTodoList() {
        return this.repository.findAll();
    }
}
