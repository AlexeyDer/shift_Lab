package shift.Lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shift.Lab.entity.Pc;

/**
 * Класс-репозиторий для сущности Pc
 *
 * @author "Alexey Derevtsov"
 */
@Repository
public interface PcRepo extends JpaRepository<Pc, Integer> {

}
