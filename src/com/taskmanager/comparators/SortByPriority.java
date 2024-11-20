package com.taskmanager.comparators;

import com.taskmanager.model.Priority;
import com.taskmanager.model.Task;

import java.util.Comparator;

public class SortByPriority implements Comparator<Task> {
    public int compare (Task t1, Task t2){
        // cases when t1 > t2
        if(t1.getPriority()== Priority.HIGH && (t2.getPriority()==Priority.LOW || t2.getPriority()==Priority.MEDIUM)){
            return 1;
        }
        if(t1.getPriority()== Priority.MEDIUM && t2.getPriority()==Priority.LOW){
            return 1;
        }
        // case when both have same priority
        if(t1.getPriority()==t2.getPriority()){
            return 0;
        }
        // cases when t2>t1
        if(t2.getPriority()== Priority.HIGH && (t1.getPriority()==Priority.LOW || t1.getPriority()==Priority.MEDIUM)){
            return -1;
        }
        else{
            return -1;
        }
    }
}
