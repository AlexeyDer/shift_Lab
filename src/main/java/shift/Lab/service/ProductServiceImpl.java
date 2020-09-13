package shift.Lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shift.Lab.entity.Product;
import shift.Lab.exception.ResourceNotFoundException;
import shift.Lab.repository.ProductRepo;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Optional<Product> productDb = this.productRepo.findById(product.getId());

        if (productDb.isPresent()) {
            Product productUpdate = productDb.get();
            productUpdate.setId(product.getId());
            productUpdate.setBatchNumber(product.getBatchNumber());
            productUpdate.setManufacturer(product.getManufacturer());
            productUpdate.setPrice(product.getPrice());
            productUpdate.setNumOfProdInStock(product.getNumOfProdInStock());
            productRepo.save(productUpdate);
            return productUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + product.getId());
        }
    }

    @Override
    public List<Product> getAllProduct() {
        return this.productRepo.findAll();
    }

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
