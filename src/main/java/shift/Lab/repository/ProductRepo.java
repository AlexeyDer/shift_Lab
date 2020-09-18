package shift.Lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shift.Lab.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
