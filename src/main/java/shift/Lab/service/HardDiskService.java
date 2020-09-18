package shift.Lab.service;

import shift.Lab.entity.HardDisk;

import java.util.List;

public interface HardDiskService {
    HardDisk createHardDisk(HardDisk hardDisk);
    HardDisk updateHardDisk(HardDisk hardDisk);
    List<HardDisk> getAllHardDisk();
    HardDisk getHardDiskById(int hardDiskId);
}
