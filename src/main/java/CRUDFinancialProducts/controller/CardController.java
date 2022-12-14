package CRUDFinancialProducts.controller;

import CRUDFinancialProducts.dto.CardDTO;
import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.service.AccountService;
import CRUDFinancialProducts.service.CardService;
import CRUDFinancialProducts.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private PersonService personService;

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

    @GetMapping("/findByAccountIdentification/{id}")
    public ResponseEntity<List<Card>> findByAccountIdentification(@PathVariable Long id){
        return ResponseEntity.ok(cardService.getCardsByAccountId(id));
    }

    @GetMapping("/findCardsByClientID")
    public List<Card> getCardsByPersonID(@RequestParam(name = "id") Long id){
       return cardService.getCardsByPersonID(id);
    }
    @GetMapping("/findCardsByClientNameAndLastname")
    public List<Card> getCardByPersonNameAndLastName(@RequestParam(name = "name") String name, @RequestParam(name = "lastname") String lastname){
        return cardService.getCardsByPersonNameAndLastname(name, lastname);
    }
}
