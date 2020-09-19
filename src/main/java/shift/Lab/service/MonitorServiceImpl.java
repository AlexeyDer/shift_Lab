package shift.Lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shift.Lab.entity.Monitor;
import shift.Lab.exception.ResourceFoundMatchException;
import shift.Lab.exception.ResourceNotFoundException;
import shift.Lab.repository.MonitorRepo;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MonitorServiceImpl implements MonitorService {

    /**
     * Поле для репозитория товара
     */
    @Autowired
    MonitorRepo monitorRepo;

    /**
     * Метод для сохранения товара типа Monitor
     *
     * @param monitor - продукт типа Pc - кандидат на сохранение
     * @return - сохранённый продукт, либо ошибка о том, что нельзя добавить данный товар, потому что он уже существует
     */
    @Override
    public Monitor createMonitor(Monitor monitor) {
        if (monitorRepo.findById(monitor.getId()).isPresent()) {
            throw new ResourceFoundMatchException("Record already exists with id: " + monitor.getId());
        }
        return this.monitorRepo.save(monitor);
    }

    /**
     * Редактирование товара
     *
     * @param monitor - полученный объект, который надо изменить
     * @return - вывод измененного товара, либо ошибка о том, что такого товара не существует
     */
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

    /**
     * Поиск всех товара в БД
     *
     * @return - список найденных пользователей
     */
    @Override
    public List<Monitor> getAllMonitor() {
        return this.monitorRepo.findAll();
    }

    /**
     * Поиск товара по идентификатору в БД
     *
     * @return - список найденных пользователей, либо вывод ошибки о том, что записать найдена
     */
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
