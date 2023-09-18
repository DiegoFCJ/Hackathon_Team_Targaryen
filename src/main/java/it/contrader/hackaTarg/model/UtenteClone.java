package it.contrader.hackaTarg.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
