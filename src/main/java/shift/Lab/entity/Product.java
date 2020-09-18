package shift.Lab.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author "Alexey Derevtsov"
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Getter
@Setter
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
}
