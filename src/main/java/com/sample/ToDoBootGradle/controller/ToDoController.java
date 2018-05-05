package com.sample.ToDoBootGradle.controller;

import com.sample.ToDoBootGradle.model.request.TaskRequest;
import com.sample.ToDoBootGradle.model.response.TaskResponse;
import com.sample.ToDoBootGradle.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @PostMapping(value = "/add-task", produces = MediaType.APPLICATION_JSON_VALUE,
                         consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TaskResponse> addUser(@RequestBody TaskRequest taskRequest)  {
        TaskResponse taskResponse = toDoService.addTask(taskRequest);
        return new ResponseEntity<>(taskResponse,HttpStatus.OK);
    }
}
