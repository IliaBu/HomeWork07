package ru.gb_architecture.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gb_architecture.model.Task;
import ru.gb_architecture.model.TaskStatus;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {
    /**
     * получить список задач по их статусу
     */
    List<Task> findByStatus(TaskStatus taskStatus);
}
