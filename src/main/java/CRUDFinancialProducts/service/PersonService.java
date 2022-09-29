package CRUDFinancialProducts.service;

import CRUDFinancialProducts.model.Person;
import CRUDFinancialProducts.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person){
        return personRepository.save(person);
    }

    public Person findById(Long cc){
        return personRepository.findById(cc).get();
    }

}
