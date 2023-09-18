package it.contrader.hackaTarg.service;

import it.contrader.hackaTarg.dao.UtenteRepository;
import it.contrader.hackaTarg.dto.UtenteDTO;
import it.contrader.hackaTarg.exception.ApiRequestException;
import it.contrader.hackaTarg.model.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UtenteService extends AbstractService<Utente, UtenteDTO> {

    @Autowired
    private UtenteRepository userRepository;

    public UtenteDTO findByUsernameAndPassword(String username, String password) throws ApiRequestException {
        Utente utente = userRepository.findByUsernameAndPassword(username, password);
        if (utente != null) {
            return converter.toDTO((userRepository.findByUsernameAndPassword(username, password)));
        } else {
            throw new ApiRequestException("Non e' stato trovato nessun utente con queste credenziali.");
        }
    }

}

