package it.contrader.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.contrader.dto.LoginDTO;
import it.contrader.dto.UtenteDTO;
import it.contrader.service.UtenteService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UtenteController extends AbstractController<UtenteDTO>{
	
	@Autowired
	private UtenteService utenteService;


	//POST Angular a UserDTO
	@PostMapping(value = "/login")
	public UtenteDTO login(@RequestBody LoginDTO loginDTO ) {
		return utenteService.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
	}
}