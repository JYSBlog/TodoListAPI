package com.todo.todolist.biz.repository;

import com.todo.todolist.biz.entity.TodoEntity;
import com.todo.todolist.biz.response.TodoResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {


    @Query("""
                select new com.todo.todolist.biz.response.TodoResponse(
                    te.title,te.description,te.modifiedAt,
                    te.dueDate,te.required,te.completed
                )
                from TodoEntity te
                where te.dueDate >= :date
            """)
    List<TodoResponse> findAllDtoByDueDate(@Param("date") LocalDateTime date);

}
