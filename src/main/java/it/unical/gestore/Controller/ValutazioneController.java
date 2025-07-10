package it.unical.gestore.Controller;


import it.unical.gestore.Dto.ValutazioniDto;
import it.unical.gestore.Entity.Valutazione;
import it.unical.gestore.Service.ValutazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("valutazione")
@RestController
@CrossOrigin(origins = "*")
public class ValutazioneController {

    @Autowired
    private ValutazioneService valutazioneService;


    @RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
    public @ResponseBody Valutazione GetById(@PathVariable("id") Long id){
        return valutazioneService.retrieveValutazioneById(id).get();

    }

    @RequestMapping(value="/all",method = RequestMethod.GET)
    public @ResponseBody List<Valutazione> getAllValutazione(){
        return valutazioneService.RetrieveAllValutazione();
    }

    @RequestMapping(value = "/insertNew", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> insertNew(@RequestBody ValutazioniDto valutazioniDto) {
        String messaggio = valutazioneService.saveValutazione(valutazioniDto);

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", messaggio);

        return ResponseEntity.ok(response);
    }


}
