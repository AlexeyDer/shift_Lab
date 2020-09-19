package shift.Lab.service;

import shift.Lab.entity.Product;

import java.util.List;

/**
 * интерфейс для сущности Product
 *
 * @author "Alexey Derevtsov"
 */
public interface ProductService {
    Product createProduct(Product product);

    List<Product> getAllProduct();

    Product getProductById(int productId);
}
