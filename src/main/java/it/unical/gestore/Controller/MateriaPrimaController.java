package it.unical.gestore.Controller;

import it.unical.gestore.Dto.MateriaPrimaDto;
import it.unical.gestore.Dto.ValutazioniDto;
import it.unical.gestore.Entity.MateriaPrima;
import it.unical.gestore.Service.MateriaPrimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequestMapping("MateriaPrima")
@RestController
@CrossOrigin(origins = "*")
public class MateriaPrimaController {

    @Autowired
    private MateriaPrimaService materiaPrimaService;

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public @ResponseBody MateriaPrima getMateriaPrimaById(@PathVariable("id") Long id) {
        return materiaPrimaService.retrieveByMateriaPrimaId(id).get();
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<MateriaPrima> getAllMateriaPrima() {
        return materiaPrimaService.retrieveAllMateriaPrima();
    }

    @RequestMapping(value = "/insertNew", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> insertNew(@RequestBody MateriaPrimaDto materiaPrimaDto) {
        String messaggio = materiaPrimaService.saveMateriaPrima(materiaPrimaDto);

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", messaggio);

        return ResponseEntity.ok(response);

    }
}
