package shift.Lab.service;

import shift.Lab.entity.Laptop;

import java.util.List;

/**
 * интерфейс для сущности Laptop
 *
 * @author "Alexey Derevtsov"
 */
public interface LaptopService {
    Laptop createLaptop(Laptop laptop);

    Laptop updateLaptop(Laptop laptop);

    List<Laptop> getAllLaptops();

    Laptop getLaptopById(int laptopId);
}
