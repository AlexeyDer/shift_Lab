package shift.Lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shift.Lab.entity.Product;

/**
 * Класс-репозиторий для сущности Product
 *
 * @author "Alexey Derevtsov"
 */
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
