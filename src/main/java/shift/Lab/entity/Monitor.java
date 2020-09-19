package shift.Lab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность для типа товара Монитор
 *
 * @author "Alexey Derevtsov"
 */
@Entity
@Table(name = "monitor")
public class Monitor extends Product {

    /**
     * Поле диагонали монитора
     */
    @Column(name = "diagonal")
    private String diagonal;

    /**
     * Конструктор - создание нового объекта Monitor
     *
     * @param batchNumber      - серия товара
     * @param manufacturer     - производитель товара
     * @param price            - цена товара
     * @param numOfProdInStock - количество на складе товаров
     * @param diagonal         - диагональ монитора
     */
    public Monitor(int batchNumber, String manufacturer, double price, int numOfProdInStock, String diagonal) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.diagonal = diagonal;
    }

    /**
     * Конструктор - создание нового объекта Monitor
     *
     * @param batchNumber      - серия товара
     * @param manufacturer     - производитель товара
     * @param price            - цена товара
     * @param numOfProdInStock - количество на складе товаров
     */
    public Monitor(int batchNumber, String manufacturer, double price, int numOfProdInStock) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
    }

    /**
     * Конструктор - создание нового объекта Monitor
     *
     * @param id               - идентификатор товара
     * @param batchNumber      - серия товара
     * @param manufacturer     - производитель товара
     * @param price            - цена товара
     * @param numOfProdInStock - количество на складе товаров
     * @param diagonal         - диагональ монитора
     */
    public Monitor(int id, int batchNumber, String manufacturer, double price, int numOfProdInStock, String diagonal) {
        super(id, batchNumber, manufacturer, price, numOfProdInStock);
        this.diagonal = diagonal;
    }

    /**
     * Пустой конструктор
     */
    public Monitor() {
    }

    /**
     * Getters и Setters Product
     */
    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }
}
