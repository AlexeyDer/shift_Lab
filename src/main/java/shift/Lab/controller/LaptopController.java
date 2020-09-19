package shift.Lab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shift.Lab.entity.Laptop;
import shift.Lab.service.LaptopService;

import java.util.List;

/**
 * RestController типа товара Laptop
 *
 * @author "Alexey Derevtsov"
 */
@RestController
@RequestMapping("product/laptop")
public class LaptopController {
    /**
     * Поля для сервиса товара Laptop
     */
    @Autowired
    private LaptopService laptopService;

    /**
     * Get метод для вывода всех товаров типа Laptop
     *
     * @return вывод всех товаров в формате JSON
     */
    @GetMapping
    public ResponseEntity<List<Laptop>> getAllLaptops() {
        return ResponseEntity.ok().body(this.laptopService.getAllLaptops());
    }

    /**
     * Get метод для вывода товара типа Laptop по идентификатору
     *
     * @return вывод товара в формате JSON
     */
    @GetMapping("{id}")
    public ResponseEntity<Laptop> getLaptopById(@PathVariable int id) {
        return ResponseEntity.ok().body(this.laptopService.getLaptopById(id));
    }

    /**
     * Post метод создания товара типа laptop
     *
     * @param laptop - сущность в которую передают параметры из JSON
     * @return данные сохраняются в бд
     */
    @PostMapping
    public ResponseEntity<Laptop> createLaptop(@RequestBody Laptop laptop) {
        return ResponseEntity.ok().body(this.laptopService.createLaptop(laptop));
    }

    /**
     * Put метод редактирования товара типа laptop
     *
     * @param id     - идентификатор товара,который должен быть изменен
     * @param laptop - сущность в которую передают параметры из JSON файла
     * @return данные товара обноляются в бд
     */
    @PutMapping("{id}")
    public ResponseEntity<Laptop> updateLaptop(@PathVariable int id, @RequestBody Laptop laptop) {
        laptop.setId(id);
        return ResponseEntity.ok().body(this.laptopService.updateLaptop(laptop));
    }
}
