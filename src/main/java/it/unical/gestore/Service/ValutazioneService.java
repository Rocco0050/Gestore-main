package it.unical.gestore.Service;

import it.unical.gestore.Dto.ValutazioniDto;
import it.unical.gestore.Entity.Valutazione;
import it.unical.gestore.Repository.FornitoriRepository;
import it.unical.gestore.Repository.ValutazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ValutazioneService {

    @Autowired
    private ValutazioneRepository valutazioneRepository;

    @Autowired
    private FornitoriRepository fornitoriRepository;

    public List<Valutazione>RetrieveAllValutazione(){
        return valutazioneRepository.findAll();
    }

    public Optional<Valutazione> retrieveValutazioneById(Long id){
        return valutazioneRepository.findById(id);
    }

    public List<Valutazione>FindByPunteggio(String punteggio){
        return valutazioneRepository.findByPunteggio(punteggio);
    }

    public String saveValutazione(ValutazioniDto valutazioniDto){
        Valutazione valutazione = new Valutazione();
        valutazione.setDataValutazione(valutazioniDto.getDataValutazione());
        valutazione.setDescrizione(valutazioniDto.getDescrizione());
        valutazione.setPunteggio(String.valueOf(valutazioniDto.getPunteggio()));
        valutazione.setIdFornitori(fornitoriRepository.findById(valutazioniDto.getIdFornitore()).get());

        valutazioneRepository.save(valutazione);
        return String.format("Valutazione con id %s salvata con successo",valutazione.getId());
    }

}
