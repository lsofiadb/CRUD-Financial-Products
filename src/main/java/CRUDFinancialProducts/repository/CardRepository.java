package CRUDFinancialProducts.repository;

import CRUDFinancialProducts.model.Account;
import CRUDFinancialProducts.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    public Card findByAccount(Account account);
    @Query(value = "SELECT * FROM CARD WHERE account_id = ?1", nativeQuery = true)
    List<Card> findByAccountID(Long id);
    @Query(value = "SELECT * FROM CARD INNER JOIN ACCOUNT ON CARD.account_id = ACCOUNT.id WHERE ACCOUNT.owner_id = ?1",nativeQuery = true)
    List<Card> findCardsByPersonID(Long id);

    @Query(value = "SELECT CARD.id, CARD.cvc, CARD.number, CARD.expiration_date, CARD.account_id FROM CARD, ACCOUNT, PERSON WHERE CARD.account_id = ACCOUNT.id AND ACCOUNT.owner_id = PERSON.id AND PERSON.name = ?1 AND PERSON.lastname = ?2",nativeQuery = true)
    List<Card> findCardsByPersonNameAndLastname(String name, String lastname);
}
