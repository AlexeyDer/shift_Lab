package shift.Lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shift.Lab.entity.Product;
import shift.Lab.service.ProductService;

import java.util.List;

/**
 * RestController товара
 *
 * @author "Alexey Derevtsov"
 */
@RestController
@RequestMapping("product")
public class ProductController {
    /**
     * Поля для сервиса товара
     */
    @Autowired
    private ProductService productService;

    /**
     * Get метод для вывода всех товаров
     *
     * @return вывод всех товаров в формате JSON
     */
    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct() {
        return ResponseEntity.ok().body(productService.getAllProduct());
    }

    /**
     * Get метод для вывода товара по идентификатору
     *
     * @return вывод товара в формате JSON
     */
    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        return ResponseEntity.ok().body(this.productService.getProductById(id));
    }


}
