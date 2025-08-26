package com.dev.todolist.models;

import lombok.NonNull;

public record ToDoListDTO(
        @NonNull
        String Task,
        boolean status) {
}
