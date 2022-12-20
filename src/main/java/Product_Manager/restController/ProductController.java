package Product_Manager.restController;


import Product_Manager.dao.CategoryRepository;
import Product_Manager.dao.ProductRepository;
import Product_Manager.entities.Product;
import Product_Manager.services.CategoryService;
import Product_Manager.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
        @Autowired
      ProductService ps;
        @Autowired
        CategoryService cs;

    @GetMapping("/all")
    public List<Product> getAll() {
        return ps.getAllProducts();
    }





}
