package com.dev.todolist.dto;

import lombok.NonNull;

public record ToDoListDTO(
        @NonNull
        String Task,
        boolean status) {
}
