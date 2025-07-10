package it.unical.gestore.Repository;

import it.unical.gestore.Entity.Valutazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ValutazioneRepository extends JpaRepository<Valutazione,Long> {
    public List<Valutazione> findByPunteggio(String punteggio);
    public List<Valutazione> findAll();
    public Optional<Valutazione> findById(Long id);


}
