package shift.Lab.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "monitor")
public class Monitor extends Product {
    @Column(name = "diagonal")
    private String diagonal;

    public Monitor(int batchNumber, String manufacturer, double price, int numOfProdInStock, String diagonal) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.diagonal = diagonal;
    }
}
