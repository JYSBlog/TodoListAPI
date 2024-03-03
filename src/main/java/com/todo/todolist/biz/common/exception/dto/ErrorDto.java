package com.todo.todolist.biz.common.exception.dto;

public record ErrorDto(
        String message,
        Integer errorCode
) {
    public ErrorDto {

    }
}