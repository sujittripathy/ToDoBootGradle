package com.sample.ToDoBootGradle.util;

import com.sample.ToDoBootGradle.properties.ToDoApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ToDoUtil {

    private ToDoApplicationProperties toDoApplicationProperties;

    @Autowired
    public ToDoUtil(ToDoApplicationProperties toDoApplicationProperties) {
        this.toDoApplicationProperties = toDoApplicationProperties;
    }

    public boolean isShowCompletedTasks(){
        return toDoApplicationProperties.isShowCompletedTasks();
    }

    public String getApiKey(){
        return toDoApplicationProperties.getApiKey();
    }
}
