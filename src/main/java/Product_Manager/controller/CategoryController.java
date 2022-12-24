package Product_Manager.controller;

import Product_Manager.entities.Category;
import Product_Manager.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Controller
@RequestMapping("/apicategorie")
public class CategoryController {
/**
    @Autowired
    CategoryService cs;

    @GetMapping("/all")
    public String getAllProduits(Model m){ // interface that send attributes to the vue
        List<Category> liste = cs.getAllCategories();
        m.addAttribute("liste", liste);
        return "vueCategorie";
    }

    @GetMapping("/supprimercategorie/{id}")
    public String supprimercategorie(@PathVariable int id){ //get id from url
        sc.deleteCategorie(id);
        return "redirect:/apicategorie/all";
    }

    @GetMapping("/ajoutercategorie")
    public String ajouterCategorie(Model m){
        return "AjouterCategorie";
    }

    @PostMapping("/ajoutercategorie")
    public String ajouter(Model m, Categorie c, @RequestParam("idc") String idc){
        if (!idc.equals(""))
            c.setId(Integer.parseInt(idc));
        sc.saveCategorie(c);
        return "redirect:/apicategorie/all";
    }

    @GetMapping("/modifiercategorie/{idc}")
    public String modifierCategorie(Model m, @PathVariable("idc") int idc){
        m.addAttribute("categories", sc.getCategorie(idc));
        return "AjouterCategorie";
    }


*/


}
