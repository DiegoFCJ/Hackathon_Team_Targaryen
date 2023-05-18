package it.contrader.converter;

import it.contrader.dto.UtenteCloneDTO;
import it.contrader.dto.UtenteDTO;
import it.contrader.model.Clone;
import it.contrader.model.Utente;
import it.contrader.model.UtenteClone;
import org.springframework.stereotype.Component;

@Component
public class UtenteCloneConverter extends AbstractConverter<UtenteClone, UtenteCloneDTO> {
    @Override
    public UtenteClone toEntity(UtenteCloneDTO utenteCloneDTO) {
        UtenteClone utenteClone = null;
        if (utenteCloneDTO != null) {
            utenteClone = new UtenteClone(utenteCloneDTO.getId(),
                    utenteCloneDTO.getClone(), utenteCloneDTO.getUtente());
        }
        return utenteClone;
    }

    @Override
    public UtenteCloneDTO toDTO(UtenteClone utenteClone) {
        UtenteCloneDTO utenteCloneDTO = null;
        if (utenteClone != null) {
            utenteCloneDTO = new UtenteCloneDTO(utenteClone.getId(),
                    utenteCloneDTO.getClone(), utenteCloneDTO.getUtente());

        }
        return utenteCloneDTO;
    }
}
