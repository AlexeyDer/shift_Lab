package shift.Lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shift.Lab.entity.Monitor;
import shift.Lab.service.MonitorService;

import java.util.List;

@RestController
@RequestMapping("product/monitor")
public class MonitorController {
    @Autowired
    private MonitorService monitorService;

    @GetMapping
    public ResponseEntity<List<Monitor>> getAllMonitors() {
        return ResponseEntity.ok().body(this.monitorService.getAllMonitor());
    }

    @GetMapping("{id}")
    public ResponseEntity<Monitor> getMonitorById(@PathVariable int id) {
        return ResponseEntity.ok().body(this.monitorService.getMonitorById(id));
    }

    @PostMapping
    public ResponseEntity<Monitor> createMonitor(@RequestBody Monitor monitor) {
        return ResponseEntity.ok().body(this.monitorService.createMonitor(monitor));
    }

    @PutMapping("{id}")
    public ResponseEntity<Monitor> updateMonitor(@PathVariable int id, @RequestBody Monitor monitor) {
        monitor.setId(id);
        return ResponseEntity.ok().body(this.monitorService.updateMonitor(monitor));
    }

}


