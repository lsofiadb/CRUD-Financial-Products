package CRUDFinancialProducts.dto;

import CRUDFinancialProducts.model.Transaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {
    private Long id;
    private Date date;
    private double amount;
    private Long root_account_id;
    private Long destination_account_id;
    private Long category_id;

    public Transaction getTransaction(TransactionDTO transactionDTO){
        Transaction transaction = new Transaction();
        transaction.setId(transactionDTO.getId());
        transaction.setDate(transactionDTO.getDate());
        transaction.setAmount(transactionDTO.getAmount());
        return transaction;
    }
}
