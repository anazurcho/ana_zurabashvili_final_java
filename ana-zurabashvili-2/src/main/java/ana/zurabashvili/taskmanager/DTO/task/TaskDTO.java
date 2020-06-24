package ana.zurabashvili.taskmanager.DTO.task;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
}
