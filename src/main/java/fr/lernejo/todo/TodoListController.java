package fr.lernejo.todo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class TodoListController {
    private final ArrayList<Todo> listtodo = new ArrayList<Todo>();


    @PostMapping("api/todo")
    public void add(Todo mynewtodo) {
        this.listtodo.add(mynewtodo);

    }
    @GetMapping("api/todo")
    public ArrayList<Todo> getlist(){
        return listtodo;
    }
}
