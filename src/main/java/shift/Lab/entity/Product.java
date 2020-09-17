package shift.Lab.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author "Alexey Derevtsov"
 */

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

//    @Column(name = "name")
//    private String name;

    @Column(name = "batchNumber")
    private int batchNumber;
    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "price")
    private double price;

    @Column(name = "numOfProdInStock")
    private int numOfProdInStock;

//    @OneToOne
//    @JoinColumn(name = "pc_id", referencedColumnName = "id")
//    private Pc pc;
//
//    @OneToOne
//    @JoinColumn(name = "monitor_id", referencedColumnName = "id")
//    private Laptop laptop;
//
//
//    @OneToOne
//    @JoinColumn(name = "laptop_id", referencedColumnName = "id")
//    private Monitor monitor;
//
//
//    @OneToOne
//    @JoinColumn(name = "hardDist_id", referencedColumnName = "id")
//    private HardDisk hardDisk;


    public Product(int batchNumber, String manufacturer, double price, int numOfProdInStock) {
//        this.name = name;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.price = price;
        this.numOfProdInStock = numOfProdInStock;
    }


//    @ManyToOne
//    @JoinColumn(name = "store_id")
//    private Store store;
}
