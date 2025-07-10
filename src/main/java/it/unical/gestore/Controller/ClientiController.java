package it.unical.gestore.Controller;


import it.unical.gestore.Dto.ClientiDto;
import it.unical.gestore.Entity.Clienti;
import it.unical.gestore.Entity.Fornitori;
import it.unical.gestore.Service.ClientiService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("clienti")
@RestController
@CrossOrigin(origins = "*")
public class ClientiController {

    @Autowired
    private ClientiService clientiService;

    @RequestMapping(value="/getById/{id}", method = RequestMethod.GET)
    public @ResponseBody Clienti getById(@PathVariable("id") Long id) {
        return clientiService.retrieveById(id).get();
    }
    
    @RequestMapping(value="/all",method = RequestMethod.GET)
    public @ResponseBody List<Clienti> getAllClienti(){
    	return clientiService.retrieveAll();
    }
    
    @RequestMapping(value = "/insertNew", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> insertNew(@RequestBody ClientiDto clienteDto) {
        String messaggio = clientiService.saveCliente(clienteDto);

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", messaggio);

        return ResponseEntity.ok(response);
    }

}
