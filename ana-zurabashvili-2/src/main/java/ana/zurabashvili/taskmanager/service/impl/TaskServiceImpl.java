package ana.zurabashvili.taskmanager.service.impl;

import ana.zurabashvili.taskmanager.DTO.task.*;
import ana.zurabashvili.taskmanager.model.Task;
import ana.zurabashvili.taskmanager.repository.TaskRepository;
import ana.zurabashvili.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public GetTasksOutput getTasks(GetTasksInput getTasksInput) {
        List<TaskDTO> tasks = new ArrayList<>();

        for (Task task : taskRepository.findAll()) {
            tasks.add(TaskDTO.builder()
                    .id(task.getId())
                    .title(task.getTitle())
                    .description(task.getDescription())
                    .startDate(task.getStartDate())
                    .endDate(task.getEndDate())
                    .build());
        }
        return GetTasksOutput.builder().tasks(tasks).build();
    }


    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        task.setDescription(addTaskInput.getDescription());
        task.setStartDate(addTaskInput.getStartDate());
        task.setEndDate(addTaskInput.getEndDate());

        taskRepository.save(task);

        return AddTaskOutput.builder().msg("დაემატა").build();
    }

    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {
        taskRepository.deleteById(deleteTaskInput.getId());

        return DeleteTaskOutput.builder().msg("წაიშალა").build();
    }
    List<Task> tasks = new ArrayList<>();

//    @Override
//    public void deleteTask(Long id) {
//        for (Task currentTask : tasks) {
//            if (currentTask.getId().equals((id))) {
//                tasks.remove(currentTask);
//            }
//        }
//    }
}
