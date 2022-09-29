package CRUDFinancialProducts.dto;

import CRUDFinancialProducts.model.Account;
import CRUDFinancialProducts.model.Card;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardDTO {

    private Long id;
    private Long cvc;
    private Long number;
    private Date expiration_date;
    private Long account_id;

    public Card getCard(CardDTO cardDTO){
        Card card = new Card();
        card.setId(cardDTO.getId());
        card.setCvc(cardDTO.getCvc());
        card.setNumber(cardDTO.getNumber());
        card.setExpiration_date(cardDTO.getExpiration_date());
        return card;
    }
}
