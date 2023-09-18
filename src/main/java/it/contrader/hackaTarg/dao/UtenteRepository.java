package it.contrader.hackaTarg.dao;

import it.contrader.hackaTarg.model.Utente;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UtenteRepository extends JpaRepository<Utente, Long> {
	Utente findByUsernameAndPassword(String username, String password);
	
}
