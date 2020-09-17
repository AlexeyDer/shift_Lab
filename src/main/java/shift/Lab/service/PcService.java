package shift.Lab.service;

import shift.Lab.entity.Pc;
import shift.Lab.entity.Product;

import java.util.List;

public interface PcService {
    Pc createPc(Pc pc);
    Pc updatePc(Pc pc);
    List<Pc> getAllPc();
    Pc getPcById(int pcId);
}
