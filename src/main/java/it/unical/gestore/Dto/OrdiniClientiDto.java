package it.unical.gestore.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import it.unical.gestore.Enum.StatoOrdine;
import jakarta.persistence.Enumerated;

import java.util.Date;

public class OrdiniClientiDto {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date data_ordine;

    @Enumerated
    private StatoOrdine stato_ordine;

    private Long id_cliente;

    private Integer quantita_richiesta;

    private Long id_materia;

    public Date getData_ordine() {
        return data_ordine;
    }

    public void setData_ordine(Date data_ordine) {
        this.data_ordine = data_ordine;
    }

    public StatoOrdine getStato_ordine() {
        return stato_ordine;
    }

    public void setStato_ordine(StatoOrdine stato_ordine) {
        this.stato_ordine = stato_ordine;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getQuantita_richiesta() {
        return quantita_richiesta;
    }

    public void setQuantita_richiesta(Integer quantita_richiesta) {
        this.quantita_richiesta = quantita_richiesta;
    }

    public Long getId_materia() {
        return id_materia;
    }

    public void setId_materia(Long id_materia) {
        this.id_materia = id_materia;
    }
}
