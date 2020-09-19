package shift.Lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shift.Lab.entity.HardDisk;
import shift.Lab.exception.ResourceFoundMatchException;
import shift.Lab.exception.ResourceNotFoundException;
import shift.Lab.repository.HardDiskRepo;

import java.util.List;
import java.util.Optional;

/**
 * интерфейс для сущности HardDisk
 *
 * @author "Alexey Derevtsov"
 */
@Service
@Transactional
public class HardDiskServiceImpl implements HardDiskService {
    /**
     * Поле для репозитория товара
     */
    @Autowired
    private HardDiskRepo hardDiskRepo;

    /**
     * Метод для сохранения товара типа HardDisk
     *
     * @param hardDisk - продукт типа Pc - кандидат на сохранение
     * @return - сохранённый продукт, либо ошибка о том, что нельзя добавить данный товар, потому что он уже существует
     */
    @Override
    public HardDisk createHardDisk(HardDisk hardDisk) {
        if (hardDiskRepo.findById(hardDisk.getId()).isPresent()) {
            throw new ResourceFoundMatchException("Record already exists with id: " + hardDisk.getId());
        }
        return this.hardDiskRepo.save(hardDisk);
    }

    /**
     * Редактирование товара
     *
     * @param hardDisk - полученный объект, который надо изменить
     * @return - вывод измененного товара, либо ошибка о том, что такого товара не существует
     */
    @Override
    public HardDisk updateHardDisk(HardDisk hardDisk) {
        Optional<HardDisk> hardDiskDb = this.hardDiskRepo.findById(hardDisk.getId());

        if (hardDiskDb.isPresent()) {
            HardDisk hardDistUpdate = hardDiskDb.get();
            hardDistUpdate.setId(hardDisk.getId());
            hardDistUpdate.setBatchNumber(hardDisk.getBatchNumber());
            hardDistUpdate.setManufacturer(hardDisk.getManufacturer());
            hardDistUpdate.setPrice(hardDisk.getPrice());
            hardDistUpdate.setNumOfProdInStock(hardDisk.getNumOfProdInStock());
            hardDistUpdate.setCapacity(hardDisk.getCapacity());
            hardDiskRepo.save(hardDistUpdate);
            return hardDistUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + hardDisk.getId());
        }
    }

    /**
     * Поиск всех товара в БД
     *
     * @return - список найденных пользователей
     */
    @Override
    public List<HardDisk> getAllHardDisk() {
        return this.hardDiskRepo.findAll();
    }

    /**
     * Поиск товара по идентификатору в БД
     *
     * @return - список найденных пользователей, либо вывод ошибки о том, что записать найдена
     */
    @Override
    public HardDisk getHardDiskById(int hardDiskId) {
        Optional<HardDisk> hardDiskDb = this.hardDiskRepo.findById(hardDiskId);

        if (hardDiskDb.isPresent()) {
            return hardDiskDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + hardDiskId);
        }
    }
}
