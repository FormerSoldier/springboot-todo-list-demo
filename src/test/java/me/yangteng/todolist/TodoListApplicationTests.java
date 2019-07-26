package me.yangteng.todolist;

import me.yangteng.todolist.entity.TodoItem;
import me.yangteng.todolist.repo.TodoRepository;
import org.junit.Test;
import org.junit.gen5.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoListApplicationTests {

	@Autowired
	TodoRepository todoRepository;
	@Test
	public void contextLoads() {
		
	}

}
