//package shift.Lab.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.List;
//
///**
// *
// * @author "Alexey Derevtsov"
// */
//
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class Store {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String name;
//
//    @OneToMany(
//            mappedBy = "store",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    private List<Product> products;
//}
//
//
