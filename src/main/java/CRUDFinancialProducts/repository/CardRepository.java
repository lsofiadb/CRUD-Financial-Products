package CRUDFinancialProducts.repository;

import CRUDFinancialProducts.model.Account;
import CRUDFinancialProducts.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    public Card findByAccount(Account account);
}
