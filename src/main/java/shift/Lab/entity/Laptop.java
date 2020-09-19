package shift.Lab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop extends Product {

    @Column(name = "size")
    private int size;

    public Laptop(int batchNumber, String manufacturer, double price, int numOfProdInStock, int size) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.size = size;
    }

    public Laptop(int batchNumber, String manufacturer, double price, int numOfProdInStock) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
    }

    public Laptop() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
