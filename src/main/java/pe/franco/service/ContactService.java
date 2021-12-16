package pe.franco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.franco.model.Contact;
import pe.franco.repository.ContactRepository;

@Service
public class ContactService implements IContactServiceImpl {

	@Autowired
	private ContactRepository data;
	
	@Override
	public int save(Contact contact) {
		int res=0;
		Contact c=data.save(contact);
		if(!contact.equals(null)) {
			res=1;
		}
		return res;
	}
}