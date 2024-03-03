package com.todo.todolist.biz.entity;

import com.todo.todolist.biz.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TODO")
public class TodoEntity extends BaseEntity {

    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DUEDATE")
    private LocalDateTime dueDate; // 스케쥴러로 00시 마다 실패 처리
    @Column(name = "REQUIRED")
    private boolean required; // 기한 3시간전에 필수사항이 완료되지 않았다면 개인 메일 발송
    @Column(name = "COMPLETED")
    private boolean completed; // 스케쥴러로 00시 마다 실패 처리

}
