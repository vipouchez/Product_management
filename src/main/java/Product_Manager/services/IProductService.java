package Product_Manager.services;

import Product_Manager.entities.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    void saveProduct(Product p, MultipartFile mf) throws IOException;
    List<Product> getAllProducts() ;
    Product getProduct(int id);
    List<Product> searchByName(String mc);
    void deleteProduct(int id);
    String saveImage(MultipartFile mf) throws IOException;
    byte[] getImage(int id) throws IOException;


}
