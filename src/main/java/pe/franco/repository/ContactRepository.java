package pe.franco.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.franco.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {
	
}
