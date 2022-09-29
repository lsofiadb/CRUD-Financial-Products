package CRUDFinancialProducts.controller;

import CRUDFinancialProducts.dto.CreditDTO;
import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.model.Credit;
import CRUDFinancialProducts.service.CardService;
import CRUDFinancialProducts.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credit")
public class CreditController {
    @Autowired
    private CreditService creditService;

    @Autowired
    private CardService cardService;

    @PostMapping("/save")
    public ResponseEntity<Credit> save(@RequestBody CreditDTO creditDTO){
        Credit credit = new Credit();
        credit = creditDTO.getCredit(creditDTO);
        credit.setCard(cardService.findById(creditDTO.getCard_id()));
        return ResponseEntity.ok(creditService.save(credit));
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Credit> findById(@PathVariable Long id){
        return ResponseEntity.ok(creditService.findById(id));
    }

    @GetMapping("/findByCardId/{id}")
    public ResponseEntity<Credit> findByCardId(@PathVariable Long id){
        Card card = new Card();
        card = cardService.findById(id);
        return ResponseEntity.ok(creditService.findByCard(card));
    }

    @PutMapping("/update")
    public ResponseEntity<Credit> update(@RequestBody CreditDTO creditDTO){
        Credit credit = new Credit();
        credit = creditDTO.getCredit(creditDTO);
        credit.setCard(cardService.findById(creditDTO.getCard_id()));
        return ResponseEntity.ok(creditService.update(credit));
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id){
        return ResponseEntity.ok(creditService.deleteById(id));
    }

    @GetMapping("/getAllCreditCards")
    public ResponseEntity<List<Credit>> getAll(){
        return ResponseEntity.ok(creditService.getCredits());
    }
}
