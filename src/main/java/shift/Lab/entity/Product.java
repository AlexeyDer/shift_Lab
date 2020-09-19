package shift.Lab.entity;

import javax.persistence.*;

/**
 * @author "Alexey Derevtsov"
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "batchNumber")
    private int batchNumber;
    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "price")
    private double price;

    @Column(name = "numOfProdInStock")
    private int numOfProdInStock;

    public Product(int batchNumber, String manufacturer, double price, int numOfProdInStock) {
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.price = price;
        this.numOfProdInStock = numOfProdInStock;
    }

    public Product() {
    }

    public Product(int id, int batchNumber, String manufacturer, double price, int numOfProdInStock) {
        this.id = id;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.price = price;
        this.numOfProdInStock = numOfProdInStock;
    }


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
