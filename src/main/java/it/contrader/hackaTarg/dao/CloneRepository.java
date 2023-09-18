package it.contrader.hackaTarg.dao;

import it.contrader.hackaTarg.model.Clone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface CloneRepository extends JpaRepository<Clone, Long> {
}
