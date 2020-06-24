package ana.zurabashvili.taskmanager.repository;

import ana.zurabashvili.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
