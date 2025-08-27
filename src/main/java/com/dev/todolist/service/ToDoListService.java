package com.dev.todolist.service;

import com.dev.todolist.exception.ResourceNotFoundException;
import com.dev.todolist.model.ToDoList;
import com.dev.todolist.dto.ToDoListDTO;
import com.dev.todolist.repository.ToDoListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoListService {
    private final ToDoListRepository repository;

    public ToDoListService(ToDoListRepository repository){
        this.repository=repository;
    }

    public void deleteById(Long id){
        if(!repository.existsById(id)){
            throw new ResourceNotFoundException("Tarefa não encontrada");
        }
        repository.deleteById(id);

    }
    public List<ToDoList> findAllTasks(){
        return repository.findAll();
    }

    public ToDoList saveTask(ToDoListDTO dto){
       return repository.save(new ToDoList(dto));
    }

}
