package it.contrader.hackaTarg.converter;

import it.contrader.hackaTarg.dto.CloneDTO;
import it.contrader.hackaTarg.model.Clone;
import org.springframework.stereotype.Component;

@Component
public class CloneConverter extends AbstractConverter<Clone, CloneDTO>{

    @Override
    public Clone toEntity(CloneDTO cloneDTO) {
        Clone clone = null;
        if (cloneDTO != null) {
            clone = new Clone(cloneDTO.getId(),cloneDTO.getDettagliClone(),
                    cloneDTO.getCodiceIdentificativo(),cloneDTO.getUsername());
        }
        return clone;
    }

    @Override
    public CloneDTO toDTO(Clone clone) {
        CloneDTO cloneDTO = null;
        if (clone != null) {
            cloneDTO = new CloneDTO(clone.getId(),clone.getDettagliClone(),
                    clone.getCodiceIdentificativo(), clone.getUsername()
                    );

        }
        return cloneDTO;
    }

}
