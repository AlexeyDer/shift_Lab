package shift.Lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shift.Lab.entity.Monitor;
import shift.Lab.exception.ResourceFoundMatchExeption;
import shift.Lab.exception.ResourceNotFoundException;
import shift.Lab.repository.MonitorRepo;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MonitorServiceImpl implements MonitorService {

    @Autowired
    MonitorRepo monitorRepo;

    @Override
    public Monitor createMonitor(Monitor monitor) {
        if (monitorRepo.findById(monitor.getId()).isPresent()) {
            throw new ResourceFoundMatchExeption("Record already exists with id: " + monitor.getId());
        }
        return this.monitorRepo.save(monitor);
    }

    @Override
    public Monitor updateMonitor(Monitor monitor) {
        Optional<Monitor> monitorDb = this.monitorRepo.findById(monitor.getId());

        if (monitorDb.isPresent()) {
            Monitor monitorUpdate = monitorDb.get();
            monitorUpdate.setId(monitor.getId());
            monitorUpdate.setBatchNumber(monitor.getBatchNumber());
            monitorUpdate.setManufacturer(monitor.getManufacturer());
            monitorUpdate.setPrice(monitor.getPrice());
            monitorUpdate.setNumOfProdInStock(monitor.getNumOfProdInStock());
            monitorUpdate.setDiagonal(monitor.getDiagonal());
            monitorRepo.save(monitorUpdate);
            return monitorUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + monitor.getId());
        }
    }

    @Override
    public List<Monitor> getAllMonitor() {
        return this.monitorRepo.findAll();    }

    @Override
    public Monitor getMonitorById(int monitorId) {
        Optional<Monitor> monitorDb = this.monitorRepo.findById(monitorId);

        if (monitorDb.isPresent()) {
            return monitorDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + monitorId);
        }
    }
}
