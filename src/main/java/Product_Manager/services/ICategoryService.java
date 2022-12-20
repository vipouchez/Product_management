package Product_Manager.services;

import Product_Manager.entities.Category;
import Product_Manager.entities.Product;

import java.util.List;

public interface ICategoryService {
     void addCategory(Category c);
     List<Category> getAllCategories();
     List<Product> getProductByCategory(int idc);
     void deleteCategory(int id);
     void getCategory(int id);


}
