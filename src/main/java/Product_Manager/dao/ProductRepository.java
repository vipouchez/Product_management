package Product_Manager.dao;

import Product_Manager.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface ProductRepository extends JpaRepository<Product,Integer> {




     @Query("select p from Product p where p.name like %:x%")
    List<Product> searchByKW(@Param("x")String mc);

/**
    @Query("update product p set p.name = :name, p.price = :price, p.quantity = :quantity, p.category = :category_id WHERE p.id = :id")
    void updateProduct(@Param("id") Integer id, @Param("name") String name, @Param("price")Double price, @Param("quantity")int quantity,@Param("category")int category_id);

*/
}
