package it.unical.gestore.Service;

import it.unical.gestore.Dto.ClientiDto;
import it.unical.gestore.Entity.Clienti;
import it.unical.gestore.Repository.ClientiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientiService {

    @Autowired
    ClientiRepository clientiRepository;

    public List<Clienti> retrieveAll() {
        return clientiRepository.findAll();
    }

    public Optional<Clienti> retrieveByNome(String nome) {
        return clientiRepository.findByNome(nome);
    }

    public Optional<Clienti> retrieveById(Long id) {
        return clientiRepository.findById(id);
    }
    
    public String saveCliente(ClientiDto clienteDto) {
    	Clienti cliente = new Clienti ();
    	cliente.setCognome(clienteDto.getCognome());
    	cliente.setNome(clienteDto.getNome());
    	cliente.setEmail(clienteDto.getEmail());
    	cliente.setNumeroTelefono(clienteDto.getNumeroTelefono());
    	cliente.setIndirizzoSpedizione(clienteDto.getIndirizzoSpedizione());
    	
    	clientiRepository.save(cliente);
    	return String.format("Cliente con id %s salvato con successo",cliente.getId());
    	
    }

}
