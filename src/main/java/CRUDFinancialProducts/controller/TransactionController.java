package CRUDFinancialProducts.controller;

import CRUDFinancialProducts.dto.TransactionDTO;
import CRUDFinancialProducts.model.Bank;
import CRUDFinancialProducts.model.Transaction;
import CRUDFinancialProducts.service.AccountService;
import CRUDFinancialProducts.service.CategoryService;
import CRUDFinancialProducts.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/save")
    public ResponseEntity<Transaction> save(@RequestBody TransactionDTO transactionDTO){
        Transaction transaction = new Transaction();
        transaction = transactionDTO.getTransaction(transactionDTO);
        transaction.setRoot_account(accountService.findById(transactionDTO.getRoot_account_id()));
        transaction.setDestination_account(accountService.findById(transactionDTO.getDestination_account_id()));
        transaction.setCategory(categoryService.findById(transactionDTO.getCategory_id()));
        return ResponseEntity.ok(transactionService.save(transaction));
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Transaction> findById(@PathVariable Long id){
        return ResponseEntity.ok(transactionService.findById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Transaction> update(@RequestBody TransactionDTO transactionDTO){
        Transaction transaction = new Transaction();
        transaction = transactionDTO.getTransaction(transactionDTO);
        transaction.setRoot_account(accountService.findById(transactionDTO.getRoot_account_id()));
        transaction.setDestination_account(accountService.findById(transactionDTO.getDestination_account_id()));
        transaction.setCategory(categoryService.findById(transactionDTO.getCategory_id()));
        return ResponseEntity.ok(transactionService.update(transaction));
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id){
        return ResponseEntity.ok(transactionService.deleteById(id));
    }

    @GetMapping("/getTransactions")
    public ResponseEntity<List<Transaction>> getAll(){
        return ResponseEntity.ok(transactionService.getAll());
    }

}
