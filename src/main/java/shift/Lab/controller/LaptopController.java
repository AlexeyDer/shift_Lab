package shift.Lab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shift.Lab.entity.Laptop;
import shift.Lab.service.LaptopService;

import java.util.List;

@RestController
@RequestMapping("product/laptop")
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @GetMapping
    public ResponseEntity<List<Laptop>> getAllLaptops() {
        return ResponseEntity.ok().body(this.laptopService.getAllLaptops());
    }

    @GetMapping("{id}")
    public ResponseEntity<Laptop> getLaptopById(@PathVariable int id) {
        return ResponseEntity.ok().body(this.laptopService.getLaptopById(id));
    }

    @PostMapping
    public ResponseEntity<Laptop> createLaptop(@RequestBody Laptop laptop) {
        return ResponseEntity.ok().body(this.laptopService.createLaptop(laptop));
    }

    @PutMapping("{id}")
    public ResponseEntity<Laptop> updateLaptop(@PathVariable int id, @RequestBody Laptop laptop) {
        laptop.setId(id);
        return ResponseEntity.ok().body(this.laptopService.updateLaptop(laptop));
    }
}
