package shift.Lab.entity;

import javax.persistence.*;

/**
 * Сущность товара с общими значениями
 *
 * @author "Alexey Derevtsov"
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
    /**
     * Поле идентификатора товара
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    /**
     * Поле серии товара
     */
    @Column(name = "batchNumber")
    private int batchNumber;

    /**
     * Поле производителя товара
     */
    @Column(name = "manufacturer")
    private String manufacturer;

    /**
     * Поле цены товара
     */
    @Column(name = "price")
    private double price;

    /**
     * Поле количества продукции на складе
     */
    @Column(name = "numOfProdInStock")
    private int numOfProdInStock;

    /**
     * Конструктор - создание нового объекта Product
     *
     * @param batchNumber      - серия товара
     * @param manufacturer     - производитель товара
     * @param price            - цена товара
     * @param numOfProdInStock - количество на складе товаров
     */
    public Product(int batchNumber, String manufacturer, double price, int numOfProdInStock) {
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.price = price;
        this.numOfProdInStock = numOfProdInStock;
    }

    /**
     * Пустой конструктор
     */
    public Product() {
    }

    /**
     * Конструктор - создание нового объекта Product
     *
     * @param id               - идентификатор товара
     * @param batchNumber      - серия товара
     * @param manufacturer     - производитель товара
     * @param price            - цена товара
     * @param numOfProdInStock - количество на складе товаров
     */
    public Product(int id, int batchNumber, String manufacturer, double price, int numOfProdInStock) {
        this.id = id;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.price = price;
        this.numOfProdInStock = numOfProdInStock;
    }

    /**
     * Getters и Setters Product
     */

    public void setId(int id) {
        this.id = id;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumOfProdInStock(int numOfProdInStock) {
        this.numOfProdInStock = numOfProdInStock;
    }

    public int getId() {
        return id;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public int getNumOfProdInStock() {
        return numOfProdInStock;
    }
}
