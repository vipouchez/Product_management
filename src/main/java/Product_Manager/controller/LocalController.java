package Product_Manager.controller;


import Product_Manager.entities.Product;
import Product_Manager.services.CategoryService;
import Product_Manager.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/productapi")
public class LocalController {
    @Autowired
    ProductService ps;
    @Autowired
    CategoryService cs;

    @GetMapping("/all")
    public String getAll(Model model) {
        List<Product> products = ps.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/addproduct")
    public String addProduct(Model m) {
        m.addAttribute("listCategory", cs.getAllCategories());
        return "addproduct";
    }

    @GetMapping("/productmc")
    public String getProductBMC(@RequestParam String mc, Model m) {
        List<Product> products = ps.searchByName(mc);
        m.addAttribute("products", products);
        return "products";
    }

    @PostMapping("saveproduct")
    public String saveProduct(Product p) {
        //  ps.saveProduct(p);
        return "saveproduct";
    }


}







