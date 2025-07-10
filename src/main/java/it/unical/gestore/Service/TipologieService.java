package it.unical.gestore.Service;

import it.unical.gestore.Dto.TipologieDto;
import it.unical.gestore.Entity.Tipologie;
import it.unical.gestore.Repository.TipologieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipologieService {

    @Autowired
    private TipologieRepository tipologieRepository;

    public List<Tipologie> retrieveAll() {
        return tipologieRepository.findAll();
    }

    public Optional<Tipologie> retrieveById(Long id) {
        return tipologieRepository.findById(id);
    }
    
    public String saveTipologia(TipologieDto tipologiaDto) {
    	Tipologie tipologia = new Tipologie();
    	tipologia.setDescrizione(tipologiaDto.getDescrizione());
    	
    	tipologieRepository.save(tipologia);
        return String.format("Valutazione con id %s salvata con successo",tipologia.getId());
    }
}
