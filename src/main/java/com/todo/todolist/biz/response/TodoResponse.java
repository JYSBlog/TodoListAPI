package com.todo.todolist.biz.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class TodoResponse {
    private String title;
    private String description;
    private LocalDateTime modifiedAt;
    private LocalDateTime dueDate;
    private boolean required;
    private boolean completed;

}
