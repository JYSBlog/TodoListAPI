package com.todo.todolist.biz.controller;

import com.todo.todolist.biz.request.TodoRequest;
import com.todo.todolist.biz.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping
    public ResponseEntity<?> getTodoList() {
        return ResponseEntity.ok().body(todoService.getTodoList());
    }

    @PostMapping
    public ResponseEntity<?> createTodo(TodoRequest request) {
        todoService.createTodo(request);
        return ResponseEntity.created(URI.create("")).build();
    }
}
