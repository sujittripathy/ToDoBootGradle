package com.sample.ToDoBootGradle.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Getter
@Component
public class ToDoApplicationProperties {
    @Value("${show-complete-tasks}")
    private boolean showCompletedTasks;

    @Value("${todo-apikey}")
    private String apiKey;

    public boolean isShowCompletedTasks() {
        return showCompletedTasks;
    }

    public String getApiKey() {
        return apiKey;
    }

    //
//    public void setShowCompletedTasks(boolean showCompletedTasks) {
//        this.showCompletedTasks = showCompletedTasks;
//    }
}
