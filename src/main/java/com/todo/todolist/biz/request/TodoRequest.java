package com.todo.todolist.biz.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class TodoRequest {

    private String title;
    private String description;
    private LocalDateTime dueDate;
    private boolean required;
    private boolean always;

}
