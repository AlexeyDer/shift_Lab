package shift.Lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shift.Lab.entity.Pc;
import shift.Lab.exception.ResourceFoundMatchException;
import shift.Lab.exception.ResourceNotFoundException;
import shift.Lab.repository.PcRepo;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PcServiceImple implements PcService {

    /**
     * Поле для репозитория товара
     */
    @Autowired
    private PcRepo pcRepo;

    /**
     * Метод для сохранения товара типа Pc
     *
     * @param pc - продукт типа Pc - кандидат на сохранение
     * @return - сохранённый продукт, либо ошибка о том, что нельзя добавить данный товар, потому что он уже существует
     */
    @Override
    public Pc createPc(Pc pc) {
        if (pcRepo.findById(pc.getId()).isPresent()) {
            throw new ResourceFoundMatchException("Record already exists with id: " + pc.getId());
        }
        return this.pcRepo.save(pc);
    }

    /**
     * Редактирование товара
     *
     * @param pc - полученный объект, который надо изменить
     * @return - вывод измененного товара, либо ошибка о том, что такого товара не существует
     */
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

    /**
     * Поиск всех товара в БД
     *
     * @return - список найденных пользователей
     */
    @Override
    public List<Pc> getAllPc() {
        return this.pcRepo.findAll();
    }

    /**
     * Поиск товара по идентификатору в БД
     *
     * @return - список найденных пользователей, либо вывод ошибки о том, что записать найдена
     */
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
