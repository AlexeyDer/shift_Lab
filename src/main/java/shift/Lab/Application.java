package shift.Lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import shift.Lab.entity.Monitor;
import shift.Lab.entity.Pc;
import shift.Lab.entity.Product;
import shift.Lab.service.ProductService;


/**
 * Класс для запуска программы
 *
 * @author "Alexey Derevtsov"
 */


@SpringBootApplication
public class Application {

    @Autowired
    private ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Метод автоматически создает пользователей в программе
     */

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            productService.createProduct(new Monitor(321, "ASUS", 2.2, 2, "1920x1780"));
            productService.createProduct(new Pc(12, "HP", 3.3, 5, "neitop"));
            productService.createProduct(new Pc(123, "HP", 12.3, 3, "desktop"));
        };
    }
}
