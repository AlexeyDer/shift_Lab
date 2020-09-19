package shift.Lab.service;

import shift.Lab.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    List<Product> getAllProduct();
    Product getProductById(int productId);
}
