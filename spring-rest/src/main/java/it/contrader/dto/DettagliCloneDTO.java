package it.contrader.dto;

import it.contrader.model.Utente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DettagliCloneDTO {

    private long UniqueID;

    private String nome;

    private String cognome;

    private String sesso;

    private double altezza;

    private double peso;

    private String nazionalita;

    private Utente utente;

}

