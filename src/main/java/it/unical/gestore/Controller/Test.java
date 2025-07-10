package it.unical.gestore.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController//classe che invoca un determinato path
@CrossOrigin(origins = "*")
public class Test {
    @GetMapping(path="/isEnable")
    public String isEnable(){
        return  "modulo attivo";
    }
}
