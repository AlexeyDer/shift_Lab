package shift.Lab.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "hard_disk")
public class HardDisk extends Product {
    @Column(name = "capacity_gb")
    private int capacity;

    public HardDisk(int batchNumber, String manufacturer, double price, int numOfProdInStock, int capacity) {
        super(batchNumber, manufacturer, price, numOfProdInStock);
        this.capacity = capacity;
    }
}
