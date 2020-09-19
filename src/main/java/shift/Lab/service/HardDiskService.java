package shift.Lab.service;

import shift.Lab.entity.HardDisk;

import java.util.List;
/**
 * интерфейс для сущности HardDisk
 *
 * @author "Alexey Derevtsov"
 */
public interface HardDiskService {
    HardDisk createHardDisk(HardDisk hardDisk);
    HardDisk updateHardDisk(HardDisk hardDisk);
    List<HardDisk> getAllHardDisk();
    HardDisk getHardDiskById(int hardDiskId);
}
