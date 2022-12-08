package CRUDFinancialProducts.repository;

import CRUDFinancialProducts.model.Card;
import CRUDFinancialProducts.model.Debit;
import CRUDFinancialProducts.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DebitRepository extends JpaRepository<Debit, Long> {
    public Debit findByCard(Card card);
}
