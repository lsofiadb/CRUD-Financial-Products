package CRUDFinancialProducts.repository;

import CRUDFinancialProducts.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query("SELECT p FROM Person p WHERE p.name = ?1 and p.lastname = ?2")
    Person findPersonByNameAndLastname(String name, String lastname);
}
