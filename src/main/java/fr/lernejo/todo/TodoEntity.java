package fr.lernejo.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
public class TodoEntity {
    @Id
    public Long Id;
    public String message;
    public String author;


}
