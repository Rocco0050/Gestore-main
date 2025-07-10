package it.unical.gestore.Service;

import it.unical.gestore.Entity.OrdiniClienti;
import it.unical.gestore.Repository.OrdiniClientiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdiniClientiService {

    @Autowired
    private OrdiniClientiRepository ordiniClientiRepository;

    public List<OrdiniClienti> retrieveAll() {
        return ordiniClientiRepository.findAll();
    }

    public Optional<OrdiniClienti> retrieveById(Long id) {
        return ordiniClientiRepository.findById(id);
    }
}
