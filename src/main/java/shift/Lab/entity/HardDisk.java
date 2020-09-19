package shift.Lab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hard_disk")
public class HardDisk extends Product {
    @Column(name = "capacity_gb")
    private int capacity;

    public HardDisk(int batchNumber, String manufacturer, double price, int numOfProdInStock, int capacity) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.capacity = capacity;
    }

    public HardDisk(int batchNumber, String manufacturer, double price, int numOfProdInStock) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
    }

    public HardDisk() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
