package shift.Lab.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "pc")
public class Pc extends Product {
    @Column(name = "formFactor")
    private String formFactor;

    public Pc(int batchNumber, String manufacturer, double price, int numOfProdInStock, String formFactor) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.formFactor = formFactor;
    }
}

// Post
//curl -H 'Content-Type:application/json' -d '{"batchNumber":222,"manufacturer":"ASUS","price":32.3,"numOfProdInStock":10,"formFactor":"desktop"}' 'localhost:8080/product/pc'

// Put
//curl -X PUT -H 'Content-Type:application/json' -d '{"price":3333.0}' 'localhost:8080/product/pc/6'