package CRUDFinancialProducts.controller;

import CRUDFinancialProducts.dto.CardDTO;
import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.service.AccountService;
import CRUDFinancialProducts.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @Autowired
    private AccountService accountService;

    @PostMapping("/save")
    public ResponseEntity<Card> save(@RequestBody CardDTO cardDTO){
        Card card = new Card();
        card = cardDTO.getCard(cardDTO);
        card.setAccount(accountService.findById(cardDTO.getAccount_id()));
        return ResponseEntity.ok(cardService.save(card));
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Card> findById(@PathVariable Long id){
        return ResponseEntity.ok(cardService.findById(id));
    }

    @GetMapping("/findByAccountId/{id}")
    public ResponseEntity<Card> findByAccountId(@PathVariable Long id){
        return ResponseEntity.ok(cardService.findByAccount(accountService.findById(id)));
    }

    @PutMapping("/update")
    public ResponseEntity<Card> update(@RequestBody CardDTO cardDTO){
        Card card = new Card();
        card = cardDTO.getCard(cardDTO);
        card.setAccount(accountService.findById(cardDTO.getAccount_id()));
        return ResponseEntity.ok(cardService.update(card));
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id){
        return ResponseEntity.ok(cardService.deleteById(id));
    }
}
