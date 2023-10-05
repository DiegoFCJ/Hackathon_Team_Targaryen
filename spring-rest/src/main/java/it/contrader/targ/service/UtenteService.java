package it.contrader.targ.service;

import it.contrader.targ.dao.UtenteRepository;
import it.contrader.targ.dto.UtenteDTO;
import it.contrader.targ.exception.ApiRequestException;
import it.contrader.targ.model.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

