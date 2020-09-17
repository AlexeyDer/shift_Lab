package shift.Lab.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pc extends Product {
    @Column(name = "formFactor")
    private String formFactor;

    public Pc(int batchNumber, String manufacturer, double price, int numOfProdInStock, String formFactor) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.formFactor = formFactor;
    }
}
