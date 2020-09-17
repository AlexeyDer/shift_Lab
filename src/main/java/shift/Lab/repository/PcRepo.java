package shift.Lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shift.Lab.entity.Pc;

public interface PcRepo extends JpaRepository<Pc, Integer> {

}
