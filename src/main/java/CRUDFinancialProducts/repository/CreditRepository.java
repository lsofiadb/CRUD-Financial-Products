package CRUDFinancialProducts.repository;

import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.model.Credit;
import CRUDFinancialProducts.model.Debit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Long> {
    public Credit findByCard(Card card);
}
