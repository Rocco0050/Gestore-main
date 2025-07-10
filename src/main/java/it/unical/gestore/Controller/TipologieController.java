package it.unical.gestore.Controller;


import it.unical.gestore.Dto.TipologieDto;
import it.unical.gestore.Entity.Tipologie;
import it.unical.gestore.Repository.TipologieRepository;
import it.unical.gestore.Service.TipologieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("tipologie")
@RestController
@CrossOrigin(origins = "*")
public class TipologieController {

    @Autowired
    private TipologieService tipologieService;

    @RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
    public @ResponseBody Tipologie GetById(@PathVariable("id") Long id){
        return tipologieService.retrieveById(id).get();
    }

    @RequestMapping(value="/all",method = RequestMethod.GET)
    public @ResponseBody List<Tipologie> getAll(){
        return tipologieService.retrieveAll();
    }
    
    @RequestMapping(value = "/insertNew", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> insertNew(@RequestBody TipologieDto tipologieDto) {
        String messaggio = tipologieService.saveTipologia(tipologieDto);

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", messaggio);

        return ResponseEntity.ok(response);
    }

}
