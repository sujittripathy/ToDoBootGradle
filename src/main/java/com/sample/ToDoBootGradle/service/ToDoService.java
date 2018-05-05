package com.sample.ToDoBootGradle.service;

import com.sample.ToDoBootGradle.model.request.TaskRequest;
import com.sample.ToDoBootGradle.model.response.TaskResponse;
import com.sample.ToDoBootGradle.util.ToDoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class ToDoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ToDoService.class);

    @Autowired
    private ToDoUtil toDoUtil;
    public TaskResponse addTask(TaskRequest taskRequest){
        System.out.println("Task added: " + taskRequest);
        Integer id = new Random().nextInt(1000);
        System.out.println("isShowCompletedTasks,"+ toDoUtil.isShowCompletedTasks());
        return new TaskResponse(id) ;
    }
}
