package shift.Lab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность Ноутбук.
 * Тип товара
 *
 * @author "Alexey Derevtsov"
 */
@Entity
@Table(name = "laptop")
public class Laptop extends Product {

    /**
     * Поле размера ноутбука
     */
    @Column(name = "size")
    private int size;

    /**
     * Конструктор - создание нового объекта Laptop
     *
     * @param batchNumber      - серия товара
     * @param manufacturer     - производитель товара
     * @param price            - цена товара
     * @param numOfProdInStock - количество на складе товаров
     * @param size             - размер ноутбука
     */
    public Laptop(int batchNumber, String manufacturer, double price, int numOfProdInStock, int size) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.size = size;
    }

    /**
     * Конструктор - создание нового объекта Laptop
     *
     * @param batchNumber      - серия товара
     * @param manufacturer     - производитель товара
     * @param price            - цена товара
     * @param numOfProdInStock - количество на складе товаров
     */
    public Laptop(int batchNumber, String manufacturer, double price, int numOfProdInStock) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
    }

    /**
     * Пустой конструктор
     */
    public Laptop() {
    }

    /**
     * Getters и Setters Product
     */
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
