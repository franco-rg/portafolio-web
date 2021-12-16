package pe.franco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.franco.model.Contact;
import pe.franco.model.response.ResultadoResponse;
import pe.franco.service.ContactService;

@Controller
public class IndexController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("index")
	public String index() { 
		return "index";
 	}
	
	@PostMapping("/registrarContactjs")
    @ResponseBody
    public ResultadoResponse registrarContact(@RequestBody Contact contact) {
        try {
            contactService.save(contact);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        return new ResultadoResponse();
    }
}
