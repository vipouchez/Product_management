package Product_Manager.entities;

import lombok.*;

import javax.persistence.*;


@Entity
@Data

@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;
    private int quantity;
    private String picture;
    @ManyToOne
    private  Category category;

public String toString(){
return null;
}

}
