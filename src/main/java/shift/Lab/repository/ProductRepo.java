package shift.Lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shift.Lab.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
