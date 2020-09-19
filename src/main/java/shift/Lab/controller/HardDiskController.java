package shift.Lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shift.Lab.entity.HardDisk;
import shift.Lab.service.HardDiskService;

import java.util.List;

/**
 * RestController типа товара hardDisk
 *
 * @author "Alexey Derevtsov"
 */
@RestController
@RequestMapping("product/hard_disk")
public class HardDiskController {
    /**
     * Поля для сервиса товара hardDisk
     */
    @Autowired
    private HardDiskService hardDiskService;

    /**
     * Get метод для вывода всех товаров типа HardDisk
     *
     * @return вывод всех товаров в формате JSON
     */
    @GetMapping
    public ResponseEntity<List<HardDisk>> getAllHardDisk() {
        return ResponseEntity.ok().body(this.hardDiskService.getAllHardDisk());
    }

    /**
     * Get метод для вывода товара типа HardDisk по идентификатору
     *
     * @return вывод товара в формате JSON
     */
    @GetMapping("{id}")
    public ResponseEntity<HardDisk> getHardDiskById(@PathVariable int id) {
        return ResponseEntity.ok().body(this.hardDiskService.getHardDiskById(id));
    }

    /**
     * Post метод создания товара типа hardDisk
     *
     * @param hardDisk - сущность в которую передают параметры из JSON
     * @return данные сохраняются в бд
     */
    @PostMapping
    public ResponseEntity<HardDisk> createLaptop(@RequestBody HardDisk hardDisk) {
        return ResponseEntity.ok().body(this.hardDiskService.createHardDisk(hardDisk));
    }

    /**
     * Put метод редактирования товара типа hardDisk
     *
     * @param id       - идентификатор товара,который должен быть изменен
     * @param hardDisk - сущность в которую передают параметры из JSON файла
     * @return данные товара обноляются в бд
     */
    @PutMapping("{id}")
    public ResponseEntity<HardDisk> updateHardDisk(@PathVariable int id, @RequestBody HardDisk hardDisk) {
        hardDisk.setId(id);
        return ResponseEntity.ok().body(this.hardDiskService.updateHardDisk(hardDisk));
    }
}
