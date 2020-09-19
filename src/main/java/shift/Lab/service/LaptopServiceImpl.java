package shift.Lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shift.Lab.entity.Laptop;
import shift.Lab.exception.ResourceFoundMatchException;
import shift.Lab.exception.ResourceNotFoundException;
import shift.Lab.repository.LaptopRepo;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LaptopServiceImpl implements LaptopService {

    /**
     * Поле для репозитория товара
     */
    @Autowired
    private LaptopRepo laptopRepo;

    /**
     * Метод для сохранения товара типа Laptop
     *
     * @param laptop - продукт типа Pc - кандидат на сохранение
     * @return - сохранённый продукт, либо ошибка о том, что нельзя добавить данный товар, потому что он уже существует
     */
    @Override
    public Laptop createLaptop(Laptop laptop) {
        if (laptopRepo.findById(laptop.getId()).isPresent()) {
            throw new ResourceFoundMatchException("Record already exists with id: " + laptop.getId());
        }
        return this.laptopRepo.save(laptop);
    }

    /**
     * Редактирование товара
     *
     * @param laptop - полученный объект, который надо изменить
     * @return - вывод измененного товара, либо ошибка о том, что такого товара не существует
     */
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

    /**
     * Поиск всех товара в БД
     *
     * @return - список найденных пользователей
     */
    @Override
    public List<Laptop> getAllLaptops() {
        return this.laptopRepo.findAll();
    }

    /**
     * Поиск товара по идентификатору в БД
     *
     * @return - список найденных пользователей, либо вывод ошибки о том, что записать найдена
     */
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
