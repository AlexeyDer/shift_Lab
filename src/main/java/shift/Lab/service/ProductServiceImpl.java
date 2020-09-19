package shift.Lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shift.Lab.entity.Product;
import shift.Lab.exception.ResourceNotFoundException;
import shift.Lab.repository.ProductRepo;

import java.util.List;
import java.util.Optional;

/**
 * Класс-сервис для репозитория товара
 *
 * @author "Alexey Derevtsov"
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    /**
     * Поле для репозитория товара
     */
    @Autowired
    private ProductRepo productRepo;

    /**
     * Метод для сохранения товара
     *
     * @param product - продукт - кандидат на сохранение
     * @return - сохранённый продукт
     */
    @Override
    public Product createProduct(Product product) {
        return this.productRepo.save(product);
    }

    /**
     * Поиск всех товара в БД
     *
     * @return - список найденных пользователей
     */
    @Override
    public List<Product> getAllProduct() {
        return this.productRepo.findAll();
    }

    /**
     * Поиск товара по идентификатору в БД
     *
     * @return - список найденных пользователей
     */
    @Override
    public Product getProductById(int productId) {
        Optional<Product> productDb = this.productRepo.findById(productId);

        if (productDb.isPresent()) {
            return productDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + productId);
        }
    }
}
