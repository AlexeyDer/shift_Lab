package shift.Lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shift.Lab.entity.Laptop;

/**
 * Класс-репозиторий для сущности Laptop
 *
 * @author "Alexey Derevtsov"
 */
@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Integer> {
}
