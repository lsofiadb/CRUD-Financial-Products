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
}
