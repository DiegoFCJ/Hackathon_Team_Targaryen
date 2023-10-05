package it.contrader.targ.dao;

import it.contrader.targ.model.Clone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CloneRepository extends JpaRepository<Clone, Long> {
}
