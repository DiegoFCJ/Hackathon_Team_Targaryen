package it.contrader.hackaTarg.converter;

import it.contrader.hackaTarg.dto.UtenteCloneDTO;
import it.contrader.hackaTarg.model.UtenteClone;
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
