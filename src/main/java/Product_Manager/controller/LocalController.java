package Product_Manager.controller;


import Product_Manager.entities.Product;
import Product_Manager.services.CategoryService;
import Product_Manager.services.ProductService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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
    public ModelAndView saveProduct(@ModelAttribute Product p, @RequestParam("file") MultipartFile file) throws IOException {
        ps.saveProduct(p, file);
        return new ModelAndView("redirect:/productapi/all");
    }


    @GetMapping(value = "/images/{imageNameOnServer}",
        produces = MediaType.IMAGE_JPEG_VALUE)

    public @ResponseBody
    byte[] getImage(@PathVariable String imageNameOnServer) throws IOException {
        InputStream in = new FileInputStream(System.getProperty("user.home") + File.separator + "images2022" + File.separator + imageNameOnServer);
        return IOUtils.toByteArray(in);
    }

    @PostMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        ps.deleteProduct(id);
        return "redirect:/productapi/all";

    }


    @PostMapping("updateproduct/{id}")
       public String updateProduct(Model m,@PathVariable int id){
        m.addAttribute("listCategory", cs.getAllCategories());
         Product p = ps.getProduct(id);
         p.setId(id);
        /**
         ps.update(p);
        */
        return "update";
    }


}







