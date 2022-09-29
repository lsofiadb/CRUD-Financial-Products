package CRUDFinancialProducts.dto;

import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.model.Credit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditDTO {

    private Long quota;
    private double debt;
    private Long card_id;

    public Credit getCredit(CreditDTO creditDTO){
        Credit credit = new Credit();
        credit.setQuota(creditDTO.getQuota());
        credit.setDebt(credit.getDebt());
        return credit;
    }
}
