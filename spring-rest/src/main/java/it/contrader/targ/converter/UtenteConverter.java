package it.contrader.targ.converter;

import org.springframework.stereotype.Component;

import it.contrader.targ.dto.UtenteDTO;

import it.contrader.targ.model.Utente;

@Component
public class UtenteConverter extends AbstractConverter<Utente,UtenteDTO> {

	@Override
	public Utente toEntity(UtenteDTO utenteDTO) {
		Utente utente = null;
		if (utenteDTO != null) {
			utente = new Utente(utenteDTO.getId(),utenteDTO.getUsername(),
					utenteDTO.getPassword(),utenteDTO.getNome(), utente.getCognome(),
					utenteDTO.getTelefono(), utenteDTO.getEmail());
		}
		return utente;
	}

	@Override
	public UtenteDTO toDTO(Utente utente) {
		UtenteDTO utenteDTO = null;
		if (utente != null) {
			utenteDTO = new UtenteDTO(utente.getId(),utente.getUsername(),
					utente.getPassword(),utente.getNome(), utente.getCognome(),
					utente.getTelefono(), utente.getEmail());
			
		}
		return utenteDTO;
	}
}