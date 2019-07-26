package me.yangteng.todolist.controller;

import me.yangteng.todolist.entity.TodoItem;
import me.yangteng.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController implements BaseController<TodoItem, String> {

    @Autowired
    private TodoService todoService;

    @Override
    public TodoItem save(TodoItem todoItem) {
        return todoService.save(todoItem);
    }

    @Override
    public List<TodoItem> findAll() {
        return todoService.findAll();
    }

    @Override
    public void deleteById(String s) {
        todoService.deleteById(s);
    }

    @Override
    public TodoItem update(TodoItem todoItem) {
        return todoService.save(todoItem);
    }

    @Override
    public Page<TodoItem> findAll(Pageable pageable) {
        return todoService.findAll(pageable);
    }

    @Override
    public TodoItem findById(String s) throws Exception {
        return todoService.findById(s).orElseThrow(() -> new RuntimeException("Todo item not found"));
    }
/*
    @PutMapping("/{id}/finished")
    public TodoItem toggleFinished(@PathVariable String id){
        return todoService.toggleFinished(id);
    }*/
}
