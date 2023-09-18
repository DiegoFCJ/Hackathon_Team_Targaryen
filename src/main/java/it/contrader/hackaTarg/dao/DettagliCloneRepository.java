package it.contrader.hackaTarg.dao;

import jakarta.transaction.Transactional;
import it.contrader.hackaTarg.model.DettagliClone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface DettagliCloneRepository extends CrudRepository<DettagliClone, Long>{

}