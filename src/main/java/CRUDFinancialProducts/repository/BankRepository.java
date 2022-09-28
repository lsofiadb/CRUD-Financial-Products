package CRUDFinancialProducts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bank extends JpaRepository<Bank, Long> {
}
