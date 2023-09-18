package it.contrader.hackaTarg.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class UtenteDTO {

	private long id;
	
	private String username;
	
	private String password;

	private String nome;

	private String cognome;

	private String telefono;

	private String email;


	

}
