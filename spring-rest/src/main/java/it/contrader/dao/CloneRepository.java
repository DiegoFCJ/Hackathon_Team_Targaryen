package it.contrader.dao;

import it.contrader.model.Clone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CloneRepository extends JpaRepository<Clone, Long> {
}
