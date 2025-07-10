package it.unical.gestore.Repository;

import it.unical.gestore.Entity.MateriaPrima;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MateriaPrimaRepository extends JpaRepository<MateriaPrima,Long> {
    public List<MateriaPrima> findAll();
    public Optional<MateriaPrima> findById(Long id);
}



