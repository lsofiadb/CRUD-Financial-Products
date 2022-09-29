package CRUDFinancialProducts.service;

import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.model.Credit;
import CRUDFinancialProducts.model.Debit;
import CRUDFinancialProducts.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditService {
    @Autowired
    private CreditRepository creditRepository;

    public Credit save(Credit credit){
        return creditRepository.save(credit);
    }

    public Credit findById(Long id){
        return creditRepository.findById(id).get();
    }

    public Credit findByCard(Card card){
        return creditRepository.findByCard(card);
    }

    public Credit update(Credit credit){
        return creditRepository.save(credit);
    }

    public Boolean deleteById(Long id){
        if(!creditRepository.findById(id).isEmpty()){
            creditRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public List<Credit> getCredits(){
        return creditRepository.findAll();
    }

}
