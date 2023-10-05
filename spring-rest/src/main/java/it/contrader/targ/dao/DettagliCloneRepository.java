package it.contrader.targ.dao;

import javax.transaction.Transactional;
import it.contrader.targ.model.DettagliClone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface DettagliCloneRepository extends CrudRepository<DettagliClone, Long>{

}