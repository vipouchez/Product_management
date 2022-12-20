package Product_Manager.services;

import Product_Manager.dao.ProductRepository;
import Product_Manager.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
@Service
public class ProductService implements IProductService{
    @Autowired
     ProductRepository pr ;

    @Override
    public void saveProduct(Product p, MultipartFile mf) {
    }

    @Override
    public List<Product> getAllProducts() {
        return pr.findAll();
    }

    @Override
    public Product getProduct(int id) {
        return pr.findById(id).get();
    }

   @Override
    public List<Product> searchByName(String mc) {
       return pr.searchByKW(mc);
  }

    @Override
    public void deleteProduct(int id) {
    pr.deleteById(id);
    }

    @Override
    public String saveImage(MultipartFile mf) throws IOException {
        String nameFile = mf.getOriginalFilename();
        String tab[] =nameFile.split("\\.");
        String fileModif=tab[0]+"_"+System.currentTimeMillis()+"."+tab[1];
        String chemin =System.getProperty("user.home")+"/images2022/";
        Path p = Paths.get(chemin,fileModif);
        Files.write(p,mf.getBytes());
        return fileModif;
    }

    @Override
    public byte[] getImage(int id) throws IOException {
        String nomImage=pr.findById(id).get().getPicture();
        Path p = Paths.get(System.getProperty("user.home")+"/images2022/",nomImage);
        return Files.readAllBytes(p);
    }
}
