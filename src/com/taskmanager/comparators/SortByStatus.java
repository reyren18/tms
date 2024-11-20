package com.taskmanager.comparators;

import com.taskmanager.model.Status;
import com.taskmanager.model.Task;

import java.util.Comparator;

public class SortByStatus implements Comparator<Task> {
    public int compare(Task t1, Task t2){
        if(t1.getStatus()== Status.COMPLETED && t2.getStatus()== Status.PENDING){
            return 1;
        }
        else if(t1.getStatus()==Status.PENDING && t2.getStatus()== Status.COMPLETED){
            return -1;
        }
        else {
            return 0;
        }
    }
}
