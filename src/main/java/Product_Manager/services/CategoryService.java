package Product_Manager.services;

import Product_Manager.dao.CategoryRepository;
import Product_Manager.entities.Category;
import Product_Manager.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService{
    @Autowired
    CategoryRepository cr;
    @Override
    public void addCategory(Category c) {
        cr.save(c);
    }

    @Override
    public List<Category> getAllCategories() {
        return cr.findAll();
    }

    @Override
    public List<Product> getProductByCategory(int idc) {
        return cr.findById(idc).get().getProducts();
    }

    @Override
    public void deleteCategory(int id) {
        cr.deleteById(id);
    }

    @Override
    public void getCategory(int id) {
        cr.findById(id).get();
    }
}
