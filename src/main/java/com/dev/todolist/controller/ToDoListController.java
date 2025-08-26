package com.dev.todolist.controller;

import com.dev.todolist.entity.ToDoList;
import com.dev.todolist.models.ToDoListDTO;
import com.dev.todolist.repository.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class ToDoListController {
    private ToDoListDTO dto;
    @Autowired
    private ToDoListRepository repository;


    @GetMapping("/tasks")
    public ResponseEntity<?> getDto(){
       return ResponseEntity.ok(repository.findAll());
    }


    @PostMapping("/tasks")
    public ResponseEntity<?> setTasks(@RequestBody @Validated ToDoListDTO dto){
        repository.save(new ToDoList(dto));
        return ResponseEntity.ok("Cadastrado com sucesso");
    }

}
