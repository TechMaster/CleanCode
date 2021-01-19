package todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todolist.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
