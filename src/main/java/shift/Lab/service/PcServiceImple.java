package shift.Lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shift.Lab.entity.Pc;
import shift.Lab.exception.ResourceNotFoundException;
import shift.Lab.repository.PcRepo;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PcServiceImple implements PcService {

    @Autowired
    private PcRepo pcRepo;

    @Override
    public Pc createPc(Pc pc) {
        return this.pcRepo.save(pc);
    }

    @Override
    public Pc updatePc(Pc pc) {
        Optional<Pc> pcDb = this.pcRepo.findById(pc.getId());

        if (pcDb.isPresent()) {
            Pc pcUpdate = pcDb.get();
            pcUpdate.setId(pc.getId());
            pcUpdate.setBatchNumber(pc.getBatchNumber());
            pcUpdate.setManufacturer(pc.getManufacturer());
            pcUpdate.setPrice(pc.getPrice());
            pcUpdate.setNumOfProdInStock(pc.getNumOfProdInStock());
            pcUpdate.setFormFactor(pc.getFormFactor());
            pcRepo.save(pcUpdate);
            return pcUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + pc.getId());
        }
    }

    @Override
    public List<Pc> getAllPc() {
        return this.pcRepo.findAll();
    }

    @Override
    public Pc getPcById(int pcId) {
        Optional<Pc> pcDb = this.pcRepo.findById(pcId);

        if (pcDb.isPresent()) {
            return pcDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + pcId);
        }
    }
}
