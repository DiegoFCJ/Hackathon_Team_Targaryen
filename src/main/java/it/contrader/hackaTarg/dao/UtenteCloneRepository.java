package it.contrader.hackaTarg.dao;

import it.contrader.hackaTarg.model.UtenteClone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface UtenteCloneRepository extends JpaRepository<UtenteClone, Long> {

}
