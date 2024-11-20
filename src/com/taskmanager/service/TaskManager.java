package com.taskmanager.service;

import com.taskmanager.model.Status;
import com.taskmanager.model.Task;

import java.util.TreeMap;

public class TaskManager {
    private Task task;
    TreeMap<Integer, Task> tasks = new TreeMap<>();
    public void addTask(int id, String name, String desc, int deadline){
        Task newTask = new Task(id, name, desc, deadline);
        tasks.put(id, newTask);
    }

    public void removeTask(int taskId){
        tasks.remove(taskId);
    }


}
