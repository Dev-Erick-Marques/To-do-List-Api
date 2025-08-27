package com.dev.todolist.controller;

import com.dev.todolist.dto.ToDoListDTO;
import com.dev.todolist.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class ToDoListController {

    @Autowired
    private ToDoListService service;



    @GetMapping("/tasks")
    public ResponseEntity<?> getTasks(){
        return ResponseEntity.ok(service.findAllTasks());
    }

    @PostMapping("/tasks")
    public ResponseEntity<?> setTasks(@RequestBody @Validated ToDoListDTO dto){
        service.saveTask(dto);
        return ResponseEntity.ok("Cadastrado com sucesso");
    }
    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
