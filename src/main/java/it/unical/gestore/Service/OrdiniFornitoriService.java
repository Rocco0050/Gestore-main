package it.unical.gestore.Service;

import it.unical.gestore.Entity.OrdiniFornitori;
import it.unical.gestore.Repository.OrdiniFornitoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdiniFornitoriService {

    @Autowired
    private OrdiniFornitoriRepository ordiniFornitoriRepository;

    public List<OrdiniFornitori> retrieveAll() {
        return ordiniFornitoriRepository.findAll();
    }

    public Optional<OrdiniFornitori> retrieveById(Long id){
        return ordiniFornitoriRepository.findById(id);
    }
}
