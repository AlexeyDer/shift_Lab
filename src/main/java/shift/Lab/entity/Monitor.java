package shift.Lab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "monitor")
public class Monitor extends Product {

    @Column(name = "diagonal")
    private String diagonal;

    public Monitor(int batchNumber, String manufacturer, double price, int numOfProdInStock, String diagonal) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.diagonal = diagonal;
    }

    public Monitor(int batchNumber, String manufacturer, double price, int numOfProdInStock) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
    }

    public Monitor(int id, int batchNumber, String manufacturer, double price, int numOfProdInStock, String diagonal) {
        super(id, batchNumber, manufacturer, price, numOfProdInStock);
        this.diagonal = diagonal;
    }

    public Monitor() {
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }
}
