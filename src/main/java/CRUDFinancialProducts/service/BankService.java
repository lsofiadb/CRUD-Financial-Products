package CRUDFinancialProducts.service;

import CRUDFinancialProducts.model.Account;
import CRUDFinancialProducts.model.Bank;
import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;

    public Bank save(Bank bank){
        return bankRepository.save(bank);
    }

    public Bank findById(Long id){
        return bankRepository.findById(id).get();
    }

    public Bank update(Bank bank){
        return bankRepository.save(bank);
    }

    public Boolean deleteById(Long id){
        if(!bankRepository.findById(id).isEmpty()){
            bankRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public List<Bank> getAll(){
        return bankRepository.findAll();
    }

}
