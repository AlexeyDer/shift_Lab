package shift.Lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shift.Lab.entity.Monitor;

/**
 * Класс-репозиторий для сущности Monitor
 *
 * @author "Alexey Derevtsov"
 */
@Repository
public interface MonitorRepo extends JpaRepository<Monitor, Integer> {
}
