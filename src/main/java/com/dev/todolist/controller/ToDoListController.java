package com.dev.todolist.controller;

import com.dev.todolist.models.ToDoListDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class ToDoListController {
    private ToDoListDTO dto;

    @GetMapping("/task")
    public  ToDoListDTO getDto(){
        return dto;
    }

    @PostMapping("/task")
    public String setTask(@RequestBody ToDoListDTO dto){
        this.dto = dto;
        System.out.println(dto);
        return "cadastrado com sucesso";
    }
}
