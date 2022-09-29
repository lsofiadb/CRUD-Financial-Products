package CRUDFinancialProducts.controller;

import CRUDFinancialProducts.model.Person;
import CRUDFinancialProducts.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;


    @PostMapping("/save")
    public ResponseEntity<Person> save(@RequestBody Person person){
        return ResponseEntity.ok(personService.save(person));
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Person> findById(@PathVariable Long id){
        return ResponseEntity.ok(personService.findById(id));
    }

    @GetMapping("/login")
    public ResponseEntity<Boolean> login(@RequestParam(name = "id") Long id, @RequestParam(name = "password") String password){
        return ResponseEntity.ok(personService.login(id, password));
    }

}
