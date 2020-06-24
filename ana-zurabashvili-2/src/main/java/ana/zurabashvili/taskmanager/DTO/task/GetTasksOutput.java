package ana.zurabashvili.taskmanager.DTO.task;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetTasksOutput {
    private List<TaskDTO> tasks;
}
