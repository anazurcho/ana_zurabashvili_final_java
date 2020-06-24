package ana.zurabashvili.taskmanager.service;

import ana.zurabashvili.taskmanager.DTO.task.*;
import org.springframework.stereotype.Service;

public interface TaskService {

    GetTasksOutput getTasks(GetTasksInput getTasksInput);

    AddTaskOutput addTask(AddTaskInput addTaskInput);

    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);
}
