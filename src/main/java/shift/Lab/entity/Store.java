package shift.Lab.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author "Alexey Derevtsov"
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Store {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String pc;
    private String laptop;
    private String monitor;
    private String hardDisk;
}


