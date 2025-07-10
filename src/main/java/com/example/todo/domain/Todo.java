package com.example.todo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String title;
    private String content;
    private boolean done = false;

    public Todo(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void done() {
        this.done = true;
    }

    public void fix(String title,String content ) {
        this.title = title;
        this.content = content;
    }
}