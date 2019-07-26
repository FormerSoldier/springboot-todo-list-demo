package me.yangteng.todolist.service;

import me.yangteng.todolist.entity.TodoItem;
import me.yangteng.todolist.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService implements BaseService<TodoItem, String> {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public TodoItem save(TodoItem todoItem) {
        return todoRepository.save(todoItem);
    }

    @Override
    public List<TodoItem> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public void deleteById(String s) {
        todoRepository.deleteById(s);
    }

    @Override
    public Optional<TodoItem> findById(String s) {
        return todoRepository.findById(s);
    }

    @Override
    public Page<TodoItem> findAll(Pageable pageable) {
        return todoRepository.findAll(pageable);
    }
/*
    public TodoItem toggleFinished(String id) {
        return todoRepository.findById(id)
                .map(todoItem -> {
                    todoItem.setFinished(!todoItem.isFinished());
                    return todoRepository.save(todoItem);
                })
                .orElseThrow(() -> new RuntimeException("Todo item not found"));
    }*/
}
