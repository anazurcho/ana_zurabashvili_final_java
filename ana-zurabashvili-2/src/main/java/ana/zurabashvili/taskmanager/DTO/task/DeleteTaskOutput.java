package ana.zurabashvili.taskmanager.DTO.task;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DeleteTaskOutput {
    private String msg;
}
