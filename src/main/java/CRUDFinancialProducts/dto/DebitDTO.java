package CRUDFinancialProducts.dto;

import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.model.Debit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DebitDTO {

    private Long id;
    private double balance;
    private Long card_id;

    public Debit getDebit(DebitDTO debitDTO){
        Debit debit = new Debit();
        debit.setId(debitDTO.getId());
        debit.setBalance(debitDTO.getBalance());
        return debit;
    }
}
