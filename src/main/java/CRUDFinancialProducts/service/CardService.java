package CRUDFinancialProducts.service;

import CRUDFinancialProducts.model.Account;
import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;

    public Card save(Card card){
        return cardRepository.save(card);
    }

    public Card findById(Long id){
        return cardRepository.findById(id).get();
    }

    public Card findByAccount(Account account){
        return cardRepository.findByAccount(account);
    }

    public Card update(Card card){
        return cardRepository.save(card);
    }

    public Boolean deleteById(Long id){
        if(!cardRepository.findById(id).isEmpty()){
            cardRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public List<Card> getCardsByAccountId(Long id){
        System.out.println("adasdhasdhasd"+cardRepository.findByAccountID(id));
        return cardRepository.findByAccountID(id);
    }
}
