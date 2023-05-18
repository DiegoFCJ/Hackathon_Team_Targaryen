package it.contrader.dao;

import it.contrader.model.UtenteClone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UtenteCloneRepository extends JpaRepository<UtenteClone, Long> {

}
