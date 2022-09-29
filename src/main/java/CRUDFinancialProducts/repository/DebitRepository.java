package CRUDFinancialProducts.repository;

import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.model.Debit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitRepository extends JpaRepository<Debit, Long> {
    public Debit findByCard(Card card);
}
