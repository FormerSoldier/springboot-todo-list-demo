package me.yangteng.todolist.repo;

import me.yangteng.todolist.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoItem, String> {
}
