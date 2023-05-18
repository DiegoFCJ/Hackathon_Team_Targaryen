package it.contrader.dao;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.contrader.model.Utente;

@Repository
@Transactional
public interface UtenteRepository extends JpaRepository<Utente, Long> {
	Utente findByUsernameAndPassword(String username, String password);
	
}
