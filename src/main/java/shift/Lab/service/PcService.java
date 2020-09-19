package shift.Lab.service;

import shift.Lab.entity.Pc;

import java.util.List;

/**
 * интерфейс для сущности Pc
 *
 * @author "Alexey Derevtsov"
 */
public interface PcService {
    Pc createPc(Pc pc);

    Pc updatePc(Pc pc);

    List<Pc> getAllPc();

    Pc getPcById(int pcId);
}
