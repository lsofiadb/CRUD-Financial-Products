package CRUDFinancialProducts.controller;

import CRUDFinancialProducts.model.Category;
import CRUDFinancialProducts.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/save")
    private ResponseEntity<Category> save(@RequestBody Category category){
        return ResponseEntity.ok(categoryService.save(category));
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        return ResponseEntity.ok(categoryService.findById(id));
    }

    @GetMapping("/findByName/{name}")
    public ResponseEntity<Category> findById(@PathVariable String name){
        return ResponseEntity.ok(categoryService.findByName(name));
    }

    @PutMapping("/update")
    private ResponseEntity<Category> update(@RequestBody Category category){
        return ResponseEntity.ok(categoryService.update(category));
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id){
        return ResponseEntity.ok(categoryService.deleteById(id));
    }

    @GetMapping("/getCategories")
    public ResponseEntity<List<Category>> getAll(){
        return ResponseEntity.ok(categoryService.findAll());
    }
}
