package com.saurav.ToDoApp.controller;

import com.saurav.ToDoApp.service.ToDoService;
import com.saurav.ToDoApp.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {
    @Autowired
    ToDoService toDoService;
    @GetMapping(value = "/getToDoList")
    public List<ToDo> getAllToDo(){
        return toDoService.getAllToDoInMyList();
    }
    @PostMapping(value = "/addToDo")
    public String addToDo(@RequestBody ToDo toDo){
       return toDoService.addMyToDo(toDo);
    }
    @RequestMapping(value = "getToDoByID/{ID}",method = RequestMethod.GET)
    public ToDo getToDOById(@PathVariable String ID){
        return toDoService.getToDoByID(ID);
    }

    //create a delete end point-------------->
    @DeleteMapping(value = "/DeleteToDoByID/{ID}")
    public String deleteToDoByID(@PathVariable String ID){

        return toDoService.removeToDoByID(ID);
    }
    //update---------->

    @PutMapping(value = "/updateTodoById/{ID}/{status}")
    public String updateById(@PathVariable String ID,@PathVariable String status){
        return toDoService.updateTodoById(ID,status);
    }

    @GetMapping(value = "getToDoByTheirStatus")
    public List<ToDo> getTodoByTheirStatus(@RequestParam String status){
         return toDoService.getTodoByUserStatus(status);
    }
}
