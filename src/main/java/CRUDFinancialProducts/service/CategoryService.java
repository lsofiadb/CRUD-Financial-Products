package CRUDFinancialProducts.service;

import CRUDFinancialProducts.model.Category;
import CRUDFinancialProducts.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category save(Category category){
        return categoryRepository.save(category);
    }

    public Category findById(Long id){
        return categoryRepository.findById(id).get();
    }

    public Category findByName(String name){
        return categoryRepository.findByName(name);
    }

    public Category update(Category category){
        return categoryRepository.save(category);
    }

    public Boolean deleteById(Long id){
        if(!categoryRepository.findById(id).isEmpty()){
            categoryRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
}
