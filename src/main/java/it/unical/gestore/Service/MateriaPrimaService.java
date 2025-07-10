package it.unical.gestore.Service;

import it.unical.gestore.Dto.MateriaPrimaDto;
import it.unical.gestore.Entity.MateriaPrima;
import it.unical.gestore.Repository.MateriaPrimaRepository;
import it.unical.gestore.Repository.TipologieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaPrimaService {

    @Autowired
    private MateriaPrimaRepository materiaPrimaRepository;

    @Autowired
    private TipologieRepository tipologieRepository;

    public List<MateriaPrima> retrieveAllMateriaPrima() {
        return materiaPrimaRepository.findAll();
    }
    public Optional<MateriaPrima> retrieveByMateriaPrimaId(Long materiaPrimaId) {
        return materiaPrimaRepository.findById(materiaPrimaId);
    }

    public String saveMateriaPrima(MateriaPrimaDto materiaPrimaDto){

        MateriaPrima materiaPrima = new MateriaPrima();
        materiaPrima.setNome(materiaPrimaDto.getNome());
        materiaPrima.setLivelloMinimo(materiaPrimaDto.getLivelloMinimo());
        materiaPrima.setQuantita(materiaPrimaDto.getQuantita());
        materiaPrima.setTipologie(tipologieRepository.findById(materiaPrimaDto.getTipologie()).get());


        materiaPrimaRepository.save(materiaPrima);
        return String.format("MateriaPrima salvata con successo",materiaPrima.getId());








    }
}

