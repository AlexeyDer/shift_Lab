package shift.Lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shift.Lab.entity.Pc;
import shift.Lab.service.PcService;

import java.util.List;

/**
 * RestController типа товара Pc
 *
 * @author "Alexey Derevtsov"
 */
@RestController
@RequestMapping("product/pc")
public class PcController {

    /**
     * Поля для сервиса товара Pc
     */
    @Autowired
    private PcService pcService;

    /**
     * Get метод для вывода всех товаров типа Pc
     *
     * @return вывод всех товаров в формате JSON
     */
    @GetMapping
    public ResponseEntity<List<Pc>> getAllPc() {
        return ResponseEntity.ok().body(this.pcService.getAllPc());
    }

    /**
     * Get метод для вывода товара типа Pc по идентификатору
     *
     * @return вывод товара в формате JSON
     */
    @GetMapping("{id}")
    public ResponseEntity<Pc> getPcById(@PathVariable int id) {
        return ResponseEntity.ok().body(this.pcService.getPcById(id));
    }

    /**
     * Post метод создания товара типа Pc
     *
     * @param pc - сущность в которую передают параметры из JSON
     * @return данные сохраняются в бд
     */
    @PostMapping
    public ResponseEntity<Pc> createPc(@RequestBody Pc pc) {
        return ResponseEntity.ok().body(this.pcService.createPc(pc));
    }

    /**
     * Put метод редактирования товара типа pc
     *
     * @param id - идентификатор товара,который должен быть изменен
     * @param pc - сущность в которую передают параметры из JSON файла
     * @return данные товара обноляются в бд
     */
    @PutMapping("{id}")
    public ResponseEntity<Pc> updatePc(@PathVariable int id, @RequestBody Pc pc) {
        pc.setId(id);
        return ResponseEntity.ok().body(this.pcService.updatePc(pc));
    }

}
