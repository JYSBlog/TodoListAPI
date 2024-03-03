package com.todo.todolist.biz.service;

import com.todo.todolist.biz.repository.AlwaysTodoRepository;
import com.todo.todolist.biz.repository.TodoRepository;
import com.todo.todolist.biz.request.TodoRequest;
import com.todo.todolist.biz.response.TodoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TodoService {

    private final TodoRepository todoRepository;
    private final AlwaysTodoRepository alwaysTodoRepository;

    public List<TodoResponse> getTodoList() {
        var now = LocalDate.now().atTime(0, 0);
        return todoRepository.findAllDtoByDueDate(now);
    }

    @Transactional
    public void createTodo(TodoRequest request) {
        if (request.isAlways()) {
            alwaysTodoRepository.save(null);
        }
        todoRepository.save(null);
    }
}
