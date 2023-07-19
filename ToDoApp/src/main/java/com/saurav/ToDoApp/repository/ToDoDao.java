package com.saurav.ToDoApp.repository;
import com.saurav.ToDoApp.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ToDoDao {
    private List<ToDo> toDoList;
    public ToDoDao(){
        toDoList = new ArrayList<>();
        toDoList.add(new ToDo("001","Testing",true));
    }

    public List<ToDo> getToDosFromDataSources() {
        return toDoList;
    }

    public boolean saveToDo(ToDo toDo) {
        toDoList.add(toDo);
        return true;
    }
    public boolean remove(ToDo todo){
        toDoList.remove(todo);
        return true;
    }

    public boolean update(String id, boolean status) {
        boolean updateStatus = false;
        for(ToDo todo : toDoList){
            if(todo.getID().equals(id)){
                //remove original todo
                remove(todo);
                //change this new todo now
                todo.setStatus(status);
                //add this new todo
                saveToDo(todo);
                return true;
            }
        }
        return false;
    }
}
