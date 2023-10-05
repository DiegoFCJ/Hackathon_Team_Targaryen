package it.contrader.targ.converter;

import it.contrader.targ.model.DettagliClone;
import org.springframework.stereotype.Component;

import it.contrader.targ.dto.DettagliCloneDTO;


@Component
public class DettagliCloneConverter extends AbstractConverter<DettagliClone, DettagliCloneDTO> {

    @Override
    public DettagliClone toEntity(DettagliCloneDTO dettagliCloneDTO) {
        DettagliClone dettagliClone = null;
        if (dettagliCloneDTO != null) {
            dettagliClone = new DettagliClone(dettagliCloneDTO.getUniqueID(),
                    dettagliCloneDTO.getNome(), dettagliCloneDTO.getCognome(),
                    dettagliCloneDTO.getSesso(), dettagliCloneDTO.getAltezza(),
                    dettagliCloneDTO.getPeso(), dettagliCloneDTO.getNazionalita(),
                    dettagliCloneDTO.getUtente());
        }
        return dettagliClone;
    }

    @Override
    public DettagliCloneDTO toDTO(DettagliClone dettagliClone) {
        DettagliCloneDTO dettagliCloneDTO = null;
        if (dettagliClone != null) {
            dettagliCloneDTO = new DettagliCloneDTO(dettagliClone.getUniqueID(),
                    dettagliClone.getNome(), dettagliClone.getCognome(),
                    dettagliClone.getSesso(), dettagliClone.getAltezza(),
                    dettagliClone.getPeso(), dettagliClone.getNazionalita(),
                    dettagliClone.getUtente());
        }
        return dettagliCloneDTO;
    }
}