package Product_Manager.dto;

import lombok.Data;


@Data
public class ProductDto {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int categoryId;
    private String categoryName;
}
