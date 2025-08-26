package com.dev.todolist.entity;

import com.dev.todolist.models.ToDoListDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name = "To_Do_list")
public class ToDoList {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_task;
    private String task;
    private boolean status;



    public ToDoList(ToDoListDTO dto){
        this.task = dto.Task();
        this.status = dto.status();

    }
    public ToDoList(){}

}
