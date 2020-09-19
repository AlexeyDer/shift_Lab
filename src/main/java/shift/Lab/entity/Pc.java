package shift.Lab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность для типа товара настольного компьютера
 *
 * @author "Alexey Derevtsov"
 */
@Entity
@Table(name = "pc")
public class Pc extends Product {

    /**
     * Поле форм-фактора
     */
    @Column(name = "formFactor")
    private String formFactor;

    /**
     * Конструктор - создание нового объекта Pc
     *
     * @param batchNumber      - серия товара
     * @param manufacturer     - производитель товара
     * @param price            - цена товара
     * @param numOfProdInStock - количество на складе товаров
     * @param formFactor       - форм-фактор компьютера
     */
    public Pc(int batchNumber, String manufacturer, double price, int numOfProdInStock, String formFactor) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.formFactor = formFactor;
    }

    /**
     * Пустой конструктор
     */
    public Pc() {
    }

    /**
     * Конструктор - создание нового объекта Pc
     *
     * @param formFactor - форм-фактор компьютера
     */
    public Pc(String formFactor) {
        this.formFactor = formFactor;
    }

    /**
     * Конструктор - создание нового объекта Pc
     *
     * @param id               - идентификатор товара
     * @param batchNumber      - серия товара
     * @param manufacturer     - производитель товара
     * @param price            - цена товара
     * @param numOfProdInStock - количество на складе товаров
     */
    public Pc(int id, int batchNumber, String manufacturer, double price, int numOfProdInStock) {
        super(id, batchNumber, manufacturer, price, numOfProdInStock);
    }

    /**
     * Getters и Setters Pc
     */
    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }
}

