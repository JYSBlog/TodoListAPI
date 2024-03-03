package com.todo.todolist.biz.repository;

import com.todo.todolist.biz.entity.AlwaysTodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlwaysTodoRepository extends JpaRepository<AlwaysTodoEntity, Integer> {
}
