package it.unical.gestore.Repository;

import it.unical.gestore.Entity.OrdiniFornitori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrdiniFornitoriRepository extends JpaRepository<OrdiniFornitori, Long> {
    public List<OrdiniFornitori> findAll();
    public Optional<OrdiniFornitori> findById(Long id);
}
