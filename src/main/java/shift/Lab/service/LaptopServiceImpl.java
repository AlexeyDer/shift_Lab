package shift.Lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shift.Lab.entity.Laptop;
import shift.Lab.exception.ResourceNotFoundException;
import shift.Lab.repository.LaptopRepo;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LaptopServiceImpl implements LaptopService {

    @Autowired
    private LaptopRepo laptopRepo;

    @Override
    public Laptop createLaptop(Laptop laptop) {
        return this.laptopRepo.save(laptop);
    }

    @Override
    public Laptop updateLaptop(Laptop laptop) {
        Optional<Laptop> laptopDb = this.laptopRepo.findById(laptop.getId());

        if (laptopDb.isPresent()) {
            Laptop laptopUpdate = laptopDb.get();
            laptopUpdate.setId(laptop.getId());
            laptopUpdate.setBatchNumber(laptop.getBatchNumber());
            laptopUpdate.setManufacturer(laptop.getManufacturer());
            laptopUpdate.setPrice(laptop.getPrice());
            laptopUpdate.setNumOfProdInStock(laptop.getNumOfProdInStock());
            laptopUpdate.setSize(laptop.getSize());
            laptopRepo.save(laptopUpdate);
            return laptopUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + laptop.getId());
        }
    }

    @Override
    public List<Laptop> getAllLaptops() {
        return this.laptopRepo.findAll();
    }

    @Override
    public Laptop getLaptopById(int laptopId) {
        Optional<Laptop> laptopDb = this.laptopRepo.findById(laptopId);

        if (laptopDb.isPresent()) {
            return laptopDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + laptopId);
        }
    }
}
