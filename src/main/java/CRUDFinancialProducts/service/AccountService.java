package CRUDFinancialProducts.service;

import CRUDFinancialProducts.model.Account;
import CRUDFinancialProducts.model.Person;
import CRUDFinancialProducts.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    //CREATE
    public Account save(Account account){
        return accountRepository.save(account);
    }

    //READ
    public Account findById(Long id){
        if(!accountRepository.findById(id).isEmpty()){
            return accountRepository.findById(id).get();
        }else{
            return null;
        }
    }

    //READ
    public Account findByOwner(Person owner){
        if(accountRepository.findByOwner(owner) != null){
            return accountRepository.findByOwner(owner);
        }else{
            return null;
        }
    }

    //UPDATE
    public Account update(Account account){
        return accountRepository.save(account);
    }

    //DELETE
    public boolean deleteById(Long id){
        if(!accountRepository.findById(id).isEmpty()){
            accountRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }
}
