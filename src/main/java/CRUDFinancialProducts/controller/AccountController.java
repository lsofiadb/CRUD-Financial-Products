package CRUDFinancialProducts.controller;

import CRUDFinancialProducts.dto.AccountDTO;
import CRUDFinancialProducts.model.Account;
import CRUDFinancialProducts.model.Person;
import CRUDFinancialProducts.service.AccountService;
import CRUDFinancialProducts.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public ResponseEntity<Account> save(@RequestBody AccountDTO accountDTO){
       Account account = new Account();
       account = accountDTO.getAccount(accountDTO);
       Person owner = new Person();
       owner = personService.findById(accountDTO.getOwner_id());
       account.setOwner(owner);
       return ResponseEntity.ok(accountService.save(account));
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Account> findById(@PathVariable Long id){
        return ResponseEntity.ok(accountService.findById(id));
    }

    @GetMapping("/findByOwnerId/{cc}")
    public ResponseEntity<Account> findByOwner(@PathVariable Long cc){
        Person owner = new Person();
        owner = personService.findById(cc);
        return ResponseEntity.ok(accountService.findByOwner(owner));
    }

    @PutMapping("/update")
    public ResponseEntity<Account> update(@RequestBody AccountDTO accountDTO){
        Account account = new Account();
        account = accountDTO.getAccount(accountDTO);
        Person owner = new Person();
        owner = personService.findById(accountDTO.getOwner_id());
        account.setOwner(owner);
        return ResponseEntity.ok(accountService.update(account));
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id){
        return ResponseEntity.ok(accountService.deleteById(id));
    }

}
