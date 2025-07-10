package it.unical.gestore.Repository;

import it.unical.gestore.Entity.Clienti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientiRepository extends JpaRepository<Clienti,Long> {
    public List<Clienti> findAll();
    public Optional<Clienti> findByNome(String nome);
    Optional<Clienti> findById(Long id);
}
