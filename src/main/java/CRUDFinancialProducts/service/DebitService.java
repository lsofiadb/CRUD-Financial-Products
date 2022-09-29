package CRUDFinancialProducts.service;

import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.model.Debit;
import CRUDFinancialProducts.repository.DebitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebitService {

    @Autowired
    private DebitRepository debitRepository;

    public Debit save(Debit debit){
        return debitRepository.save(debit);
    }

    public Debit findById(Long id){
        return debitRepository.findById(id).get();
    }

    public Debit findByCard(Card card){
        return debitRepository.findByCard(card);
    }

    public Debit update(Debit debit){
        return debitRepository.save(debit);
    }

    public Boolean deleteById(Long id){
        if(!debitRepository.findById(id).isEmpty()){
            debitRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public List<Debit> getDebits(){
        return debitRepository.findAll();
    }

}
