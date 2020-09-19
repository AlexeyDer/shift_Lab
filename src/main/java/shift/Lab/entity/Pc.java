package shift.Lab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pc")
public class Pc extends Product {
    @Column(name = "formFactor")
    private String formFactor;

    public Pc(int batchNumber, String manufacturer, double price, int numOfProdInStock, String formFactor) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.formFactor = formFactor;
    }

    public Pc() {
    }

    public Pc(String formFactor) {
        this.formFactor = formFactor;
    }

    public Pc(int id, int batchNumber, String manufacturer, double price, int numOfProdInStock) {
        super(id, batchNumber, manufacturer, price, numOfProdInStock);
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }
}

