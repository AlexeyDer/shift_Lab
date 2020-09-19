package shift.Lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shift.Lab.entity.Monitor;
import shift.Lab.service.MonitorService;

import java.util.List;

/**
 * RestController типа товара Monitor
 *
 * @author "Alexey Derevtsov"
 */
@RestController
@RequestMapping("product/monitor")
public class MonitorController {
    /**
     * Поля для сервиса товара Monitor
     */
    @Autowired
    private MonitorService monitorService;

    /**
     * Get метод для вывода всех товаров типа Monitor
     *
     * @return вывод всех товаров в формате JSON
     */
    @GetMapping
    public ResponseEntity<List<Monitor>> getAllMonitors() {
        return ResponseEntity.ok().body(this.monitorService.getAllMonitor());
    }

    /**
     * Get метод для вывода товара типа Monitor по идентификатору
     *
     * @return вывод товара в формате JSON
     */
    @GetMapping("{id}")
    public ResponseEntity<Monitor> getMonitorById(@PathVariable int id) {
        return ResponseEntity.ok().body(this.monitorService.getMonitorById(id));
    }

    /**
     * Post метод создания товара типа monitor
     *
     * @param monitor - сущность в которую передают параметры из JSON
     * @return данные сохраняются в бд
     */
    @PostMapping
    public ResponseEntity<Monitor> createMonitor(@RequestBody Monitor monitor) {
        return ResponseEntity.ok().body(this.monitorService.createMonitor(monitor));
    }

    /**
     * Put метод редактирования товара типа monitor
     *
     * @param id      - идентификатор товара,который должен быть изменен
     * @param monitor - сущность в которую передают параметры из JSON файла
     * @return данные товара обноляются в бд
     */
    @PutMapping("{id}")
    public ResponseEntity<Monitor> updateMonitor(@PathVariable int id, @RequestBody Monitor monitor) {
        monitor.setId(id);
        return ResponseEntity.ok().body(this.monitorService.updateMonitor(monitor));
    }

}


