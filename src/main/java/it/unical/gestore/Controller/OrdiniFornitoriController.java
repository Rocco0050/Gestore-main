package it.unical.gestore.Controller;

import it.unical.gestore.Entity.OrdiniFornitori;
import it.unical.gestore.Service.OrdiniFornitoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("ordini fornitori")
@RestController
@CrossOrigin(origins = "*")
public class OrdiniFornitoriController {

    @Autowired
    private OrdiniFornitoriService ordiniFornitoriService;


    @RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
    public @ResponseBody OrdiniFornitori getById(@PathVariable Long id){
        return ordiniFornitoriService.retrieveById(id).get();
    }


    @RequestMapping(value="/all",method = RequestMethod.GET)
    public @ResponseBody List<OrdiniFornitori> getAll(){
        return ordiniFornitoriService.retrieveAll();
    }
}
