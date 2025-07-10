package it.unical.gestore.Service;

import it.unical.gestore.Dto.FornitoriDto;
import it.unical.gestore.Entity.Fornitori;
import it.unical.gestore.Repository.FornitoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornitoriService {

    @Autowired
    private FornitoriRepository fornitoriRepository;

    public List<Fornitori> retrieveAll() {
        return fornitoriRepository.findAll();
    }

    public Optional<Fornitori> retrieveById(Long id) {
        return fornitoriRepository.findById(id);
    }
    
    public String insertNew(FornitoriDto fornitoreDto) {
    	Fornitori fornitore = new Fornitori();
    	fornitore.setCognome(fornitoreDto.getCognome());
    	fornitore.setNome(fornitoreDto.getNome());
    	fornitore.setPartitaIVA(fornitoreDto.getPartitaIVA());
    	fornitore.setEmail(fornitoreDto.getEmail());
    	fornitore.setRagioneSociale(fornitoreDto.getRagioneSociale());
    	
    	fornitoriRepository.save(fornitore);
    	return String.format("Fornitore con id %s salvato con successo",fornitore.getId());
    }
}
