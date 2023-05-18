package it.contrader.dao;

import javax.transaction.Transactional;
import it.contrader.model.DettagliClone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface DettagliCloneRepository extends CrudRepository<DettagliClone, Long>{

}