package shift.Lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import shift.Lab.entity.HardDisk;
import shift.Lab.entity.Laptop;
import shift.Lab.entity.Monitor;
import shift.Lab.entity.Pc;
import shift.Lab.service.PcService;
import shift.Lab.service.ProductService;

/**
 * Класс для запуска программы
 *
 * @author "Alexey Derevtsov"
 */
@SpringBootApplication
public class Application {

    /**
     * Поле для сервиса товара
     */
    @Autowired
    private ProductService productService;

    /**
     * Поле для сервиса товара типа pc
     */
    @Autowired
    private PcService pcService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Метод создает продукты нужного типа для начального добавления продуктов в базу данных
     */
    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            productService.createProduct(new Monitor(682, "ASUS", 2.2, 2, "1920x1780"));
            pcService.createPc(new Pc(12, "HP", 3.3, 5, "neitop"));
            pcService.createPc(new Pc(123, "HP", 12.3, 3, "desktop"));
            productService.createProduct(new Laptop(321, "HONOR", 77.0, 3, 17));
            productService.createProduct(new HardDisk(56, "HP", 77.0, 3, 256));
        };
    }
}
