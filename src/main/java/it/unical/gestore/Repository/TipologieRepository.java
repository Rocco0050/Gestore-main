package it.unical.gestore.Repository;

import it.unical.gestore.Entity.Tipologie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TipologieRepository extends  JpaRepository<Tipologie,Long> {
    public List<Tipologie> findAll();
    public Optional<Tipologie> findById(Long id);
}
