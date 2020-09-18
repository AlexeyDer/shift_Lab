package shift.Lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shift.Lab.entity.Pc;

@Repository
public interface PcRepo extends JpaRepository<Pc, Integer> {

}
