package it.contrader.targ.dao;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.contrader.targ.model.Utente;

@Repository
@Transactional
public interface UtenteRepository extends JpaRepository<Utente, Long> {
	Utente findByUsernameAndPassword(String username, String password);
	
}
