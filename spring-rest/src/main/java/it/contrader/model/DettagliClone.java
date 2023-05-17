package it.contrader.model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DettagliClone")
public class DettagliClone {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long UniqueID;

    @Column(unique = true)
    private String pazienza;

    private String autodisciplina;

    private String empatia;

    private double tolleranza;

    private double peso;

    private String nazionalita;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDUtente")
    private Utente utente;


}