package shift.Lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shift.Lab.entity.HardDisk;
import shift.Lab.service.HardDiskService;

import java.util.List;

@RestController
@RequestMapping("product/hard_disk")
public class HardDiskController {
    @Autowired
    private HardDiskService hardDiskService;

    @GetMapping
    public ResponseEntity<List<HardDisk>> getAllHardDisk() {
        return ResponseEntity.ok().body(this.hardDiskService.getAllHardDisk());
    }

    @GetMapping("{id}")
    public ResponseEntity<HardDisk> getHardDiskById(@PathVariable int id) {
        return ResponseEntity.ok().body(this.hardDiskService.getHardDiskById(id));
    }

    @PostMapping
    public ResponseEntity<HardDisk> createLaptop(@RequestBody HardDisk hardDisk) {
        return ResponseEntity.ok().body(this.hardDiskService.createHardDisk(hardDisk));
    }

    @PutMapping("{id}")
    public ResponseEntity<HardDisk> updateHardDisk(@PathVariable int id, @RequestBody HardDisk hardDisk) {
        hardDisk.setId(id);
        return ResponseEntity.ok().body(this.hardDiskService.updateHardDisk(hardDisk));
    }
}
