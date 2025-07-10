package it.unical.gestore.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "valutazioni")
public class Valutazione implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "data_valutazione", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dataValutazione;

    @Column(name = "descrizione", nullable = false)
    private String descrizione;

    @Column(name = "punteggio", nullable = false)
    private String punteggio;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_fornitore", nullable = false)
    private Fornitori idFornitori;

    public Valutazione() {
    }

    public Valutazione(Long id, Date dataValutazione, String descrizione, String punteggio, Fornitori idFornitori) {
        this.id = id;
        this.dataValutazione = dataValutazione;
        this.descrizione = descrizione;
        this.punteggio = punteggio;
        this.idFornitori = idFornitori;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(String punteggio) {
        this.punteggio = punteggio;
    }

    public Fornitori getIdFornitori() {
        return idFornitori;
    }

    public void setIdFornitori(Fornitori idFornitori) {
        this.idFornitori = idFornitori;
    }
}

