package CRUDFinancialProducts.service;

import CRUDFinancialProducts.model.Transaction;
import CRUDFinancialProducts.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction save(Transaction transaction){
        return transactionRepository.save(transaction);
    }

    public Transaction findById(Long id){
        return transactionRepository.findById(id).get();
    }

    public Transaction update(Transaction transaction){
        return transactionRepository.save(transaction);
    }

    public Boolean deleteById(Long id){
        if(!transactionRepository.findById(id).isEmpty()){
            transactionRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public List<Transaction> getAll(){
        return transactionRepository.findAll();
    }

}
