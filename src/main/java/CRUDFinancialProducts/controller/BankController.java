package CRUDFinancialProducts.controller;

import CRUDFinancialProducts.model.Bank;
import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping("/save")
    private ResponseEntity<Bank> save(@RequestBody Bank bank){
        return ResponseEntity.ok(bankService.save(bank));
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Bank> findById(@PathVariable Long id){
        return ResponseEntity.ok(bankService.findById(id));
    }

    @PutMapping("/update")
    private ResponseEntity<Bank> update(@RequestBody Bank bank){
        return ResponseEntity.ok(bankService.update(bank));
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id){
        return ResponseEntity.ok(bankService.deleteById(id));
    }

}
