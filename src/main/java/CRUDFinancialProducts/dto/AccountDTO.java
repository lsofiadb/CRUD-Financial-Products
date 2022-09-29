package CRUDFinancialProducts.dto;

import CRUDFinancialProducts.model.Account;
import CRUDFinancialProducts.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private Long id;
    private Long number;
    private String password;
    private Long owner_id;

    public Account getAccount(AccountDTO accountDTO){
        Account account = new Account();

        account.setNumber(accountDTO.getNumber());
        account.setPassword(accountDTO.getPassword());
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+account);
        System.out.println("bbbbbbbbbbbbbbbbbbbbb"+accountDTO);
        return account;
    }
}
