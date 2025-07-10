package it.unical.gestore.Controller;

import it.unical.gestore.Entity.OrdiniClienti;
import it.unical.gestore.Entity.Valutazione;
import it.unical.gestore.Service.OrdiniClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("ordini clienti")
@RestController
@CrossOrigin(origins = "*")
public class OrdiniClientiController {

    @Autowired
    private OrdiniClientiService ordiniClientiService;

    @RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
    public @ResponseBody OrdiniClienti GetById(@PathVariable("id") Long id){
        return ordiniClientiService.retrieveById(id).get();
    }

    @RequestMapping(value="/all",method = RequestMethod.GET)
    public @ResponseBody List<OrdiniClienti> getAll(){
        return ordiniClientiService.retrieveAll();
    }
}
