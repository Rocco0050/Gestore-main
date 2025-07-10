package it.unical.gestore.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ValutazioniDto {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dataValutazione;

    private String descrizione;

    private int punteggio;

    private Long idFornitore;

    public Date getDataValutazione() {
        return dataValutazione;
    }

    public void setDataValutazione(Date dataValutazione) {
        this.dataValutazione = dataValutazione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public Long getIdFornitore() {
        return idFornitore;
    }

    public void setIdFornitore(Long idFornitore) {
        this.idFornitore = idFornitore;
    }
}
