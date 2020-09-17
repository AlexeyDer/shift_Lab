package shift.Lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shift.Lab.entity.Pc;
import shift.Lab.service.PcService;

import java.util.List;

@RestController
@RequestMapping("product/pc")
public class PcController {

    @Autowired
    private PcService pcService;

    @GetMapping
    public ResponseEntity<List<Pc>> getAllPc() {
        return ResponseEntity.ok().body(this.pcService.getAllPc());
    }

    @GetMapping("{id}")
    public ResponseEntity<Pc> getPcById(@PathVariable int id) {
        return ResponseEntity.ok().body(this.pcService.getPcById(id));
    }

    @PostMapping
    public ResponseEntity<Pc> createPc(@RequestBody Pc pc) {
        return ResponseEntity.ok().body(this.pcService.createPc(pc));
    }

    @PutMapping("{id}")
    public ResponseEntity<Pc> updatePc(@PathVariable int id, @RequestBody Pc pc) {
        pc.setId(id);
        return ResponseEntity.ok().body(this.pcService.updatePc(pc));
    }

}
