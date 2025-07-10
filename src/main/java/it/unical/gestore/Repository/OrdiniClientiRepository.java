package it.unical.gestore.Repository;

import it.unical.gestore.Entity.OrdiniClienti;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrdiniClientiRepository extends CrudRepository<OrdiniClienti,Long> {
    public List<OrdiniClienti> findAll();
    public Optional<OrdiniClienti> findById(Long id);
}
