package it.contrader.service;

import org.springframework.stereotype.Service;

import it.contrader.dao.UtenteRepository;
import it.contrader.dto.UtenteDTO;
import it.contrader.model.Utente;

@Service
public class UtenteService extends AbstractService<Utente, UtenteDTO> {
	
	//ALL crud methods in AbstractService
	
	//LOGIN method
	public UtenteDTO findByUsernameAndPassword(String username, String password) {
		return converter.toDTO(((UtenteRepository)repository).findByUsernameAndPassword(username, password));
	}

}
