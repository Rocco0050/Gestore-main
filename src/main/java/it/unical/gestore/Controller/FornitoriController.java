package it.unical.gestore.Controller;

import it.unical.gestore.Dto.FornitoriDto;
import it.unical.gestore.Entity.Fornitori;
import it.unical.gestore.Service.FornitoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("fornitori")
@RestController
@CrossOrigin(origins = "*")
public class FornitoriController {

    @Autowired
    private FornitoriService fornitoriService;

    @RequestMapping(value="/getById/{id}", method = RequestMethod.GET)
    public @ResponseBody Fornitori getFornitoriById(@PathVariable("id") Long id){
        return fornitoriService.retrieveById(id).get();
    }

    @RequestMapping(value="/all", method = RequestMethod.GET)
    public @ResponseBody List<Fornitori> getAllFornitori() {
        return fornitoriService.retrieveAll();
    }
    
    @RequestMapping(value = "/insertNew", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> insertNew(@RequestBody FornitoriDto fornitoreDto) {
        String messaggio = fornitoriService.insertNew(fornitoreDto);

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", messaggio);

        return ResponseEntity.ok(response);
    }
}
