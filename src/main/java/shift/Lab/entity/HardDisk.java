package shift.Lab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность Жесктого диска.
 * Тип товара
 *
 * @author "Alexey Derevtsov"
 */
@Entity
@Table(name = "hard_disk")
public class HardDisk extends Product {

    /**
     * Поле объема жесткого диска
     */
    @Column(name = "capacity_gb")
    private int capacity;

    /**
     * Конструктор - создание нового объекта HardDisk
     *
     * @param batchNumber      - серия товара
     * @param manufacturer     - производитель товара
     * @param price            - цена товара
     * @param numOfProdInStock - количество на складе товаров
     * @param capacity         - объем жесткого диска
     */
    public HardDisk(int batchNumber, String manufacturer, double price, int numOfProdInStock, int capacity) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.capacity = capacity;
    }

    /**
     * Конструктор - создание нового объекта HardDisk
     *
     * @param batchNumber      - серия товара
     * @param manufacturer     - производитель товара
     * @param price            - цена товара
     * @param numOfProdInStock - количество на складе товаров
     */
    public HardDisk(int batchNumber, String manufacturer, double price, int numOfProdInStock) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
    }

    /**
     * Пустой конструктор
     */
    public HardDisk() {
    }

    /**
     * Getters и Setters Product
     */
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
