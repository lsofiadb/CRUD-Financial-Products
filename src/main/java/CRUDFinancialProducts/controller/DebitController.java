package CRUDFinancialProducts.controller;

import CRUDFinancialProducts.dto.DebitDTO;
import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.model.Debit;
import CRUDFinancialProducts.service.CardService;
import CRUDFinancialProducts.service.DebitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/debit")
public class DebitController {

    @Autowired
    private DebitService debitService;

    @Autowired
    private CardService cardService;

    @PostMapping("/save")
    public ResponseEntity<Debit> save(@RequestBody DebitDTO debitDTO){
        Debit debit = new Debit();
        debit = debitDTO.getDebit(debitDTO);
        debit.setCard(cardService.findById(debitDTO.getCard_id()));
        return ResponseEntity.ok(debitService.save(debit));
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Debit> findById(@PathVariable Long id){
        return ResponseEntity.ok(debitService.findById(id));
    }

    @GetMapping("/findByCardId/{id}")
    public ResponseEntity<Debit> findByCardId(@PathVariable Long id){
        Card card = new Card();
        card = cardService.findById(id);
        return ResponseEntity.ok(debitService.findByCard(card));
    }

    @PutMapping("/update")
    public ResponseEntity<Debit> update(@RequestBody DebitDTO debitDTO){
        Debit debit = new Debit();
        debit = debitDTO.getDebit(debitDTO);
        debit.setCard(cardService.findById(debitDTO.getCard_id()));
        return ResponseEntity.ok(debitService.update(debit));
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id){
        return ResponseEntity.ok(debitService.deleteById(id));
    }

    @GetMapping("/getAllDebitCards")
    public ResponseEntity<List<Debit>> getAll(){
        return ResponseEntity.ok(debitService.getDebits());
    }
}
