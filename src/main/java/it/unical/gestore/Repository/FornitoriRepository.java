package it.unical.gestore.Repository;

import it.unical.gestore.Entity.Fornitori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FornitoriRepository extends JpaRepository<Fornitori,Long> {
    public List<Fornitori> findAll();
    public Optional<Fornitori> findById(Long id);
}
