package shift.Lab.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "laptop")
public class Laptop extends Product {

    @Column(name = "size")
    private int size;

    public Laptop(int batchNumber, String manufacturer, double price, int numOfProdInStock, int size) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.size = size;
    }

}
