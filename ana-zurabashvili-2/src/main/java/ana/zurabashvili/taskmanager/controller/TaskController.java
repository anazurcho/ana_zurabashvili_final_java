package ana.zurabashvili.taskmanager.controller;

import ana.zurabashvili.taskmanager.DTO.task.*;
import ana.zurabashvili.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class TaskController {
    final private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/Tasks")
    public GetTasksOutput getTasks(@RequestBody GetTasksInput getTasksInput) {
        return taskService.getTasks(getTasksInput);
    }

    @PostMapping("/Add")
    public AddTaskOutput addTask(@RequestBody AddTaskInput addTaskInput) {
        return taskService.addTask(addTaskInput);
    }

    @PostMapping("/Delete")
    public DeleteTaskOutput deleteTask(@RequestBody DeleteTaskInput deleteTaskInput) {
        return taskService.deleteTask(deleteTaskInput);
    }
}
