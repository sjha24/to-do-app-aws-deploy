package com.saurav.ToDoApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class ToDo {
    private String ID;
//    @JsonProperty("toDo_name")
    private String toDoName;
    private Boolean status;
}
