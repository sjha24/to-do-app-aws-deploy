package com.saurav.ToDoApp.service;
import com.saurav.ToDoApp.model.ToDo;
import com.saurav.ToDoApp.repository.ToDoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    @Autowired
    ToDoDao toDoDao;

    public List<ToDo> getAllToDoInMyList() {
        return toDoDao.getToDosFromDataSources();
    }

    public String addMyToDo(ToDo toDo) {
        boolean insertionStatus = toDoDao.saveToDo(toDo);
        if(insertionStatus){
            return "ToDo Added Successfully Thank You !!!!";
        }else{
            return "Failed ToDo not Added !!!";
        }
    }

    public ToDo getToDoByID(String id) {
        List<ToDo>toDOListRightNow = toDoDao.getToDosFromDataSources();
        for(ToDo toDo : toDOListRightNow){
            if(toDo.getID().equals(id)){
                return toDo;
            }
        }
        return null;
    }

    public String removeToDoByID(String id) {
        boolean deleteResponse = false;
        String status;
        if(id != null){
            List<ToDo>toDOListRightNow = toDoDao.getToDosFromDataSources();
            for(ToDo toDo : toDOListRightNow){
                if(toDo.getID().equals(id)){
                    deleteResponse = toDoDao.remove(toDo);
                    if(deleteResponse){
                        status = "todo with this ID "+id+" was deleted !!";
                    }else{
                        status = "todo with this ID "+id+" not find database error !!!!";
                    }
                       return status;
                }

            }
                    return "todo with this id " + id + " does not exist !!!";

        }
            return "Invalid id cannot access null id";


    }

    public String updateTodoById(String id, String status) {
        boolean updateStatus = toDoDao.update(id,Boolean.parseBoolean(status));
        if(updateStatus){
            return "todo with this ID "+id+" was updated !!";
        }else{
            return "todo with this ID "+id+" was not updated !!";
        }
    }

    public List<ToDo> getTodoByUserStatus(String status) {
        List<ToDo>toDoListRightNow = toDoDao.getToDosFromDataSources();
        List<ToDo>toDoListStatusBased = new ArrayList<>();
        for(ToDo todo : toDoListRightNow){
            if(todo.getStatus() == Boolean.parseBoolean(status)){
                toDoListStatusBased.add(todo);
            }
        }
        return toDoListStatusBased;
    }
}
