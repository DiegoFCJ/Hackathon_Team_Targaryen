package it.contrader.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UtenteClone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "IdClone")
    private Clone clone;

    @ManyToOne
    @JoinColumn(name = "IdUtente")
    private Utente utente;
}
