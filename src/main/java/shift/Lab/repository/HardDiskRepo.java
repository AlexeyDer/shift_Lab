package shift.Lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shift.Lab.entity.HardDisk;

/**
 * Класс-репозиторий для сущности HardDisk
 *
 * @author "Alexey Derevtsov"
 */
@Repository
public interface HardDiskRepo extends JpaRepository<HardDisk, Integer> {
}
