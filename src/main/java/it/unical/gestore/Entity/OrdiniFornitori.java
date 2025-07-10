package it.unical.gestore.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ordini_fornitori")
public class OrdiniFornitori implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "data_ordine")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dataOrdine;

    @Column(name = "stato_ordine")
    private String statoOrdine;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_fornitori", nullable = false)
    private  Fornitori fornitori;

    @Column(name = "quantita_richiesta")
    private Integer quantitaRichiesta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_materia_prima", nullable = false)
    private MateriaPrima materiaPrima;

    public OrdiniFornitori(Long id, Date dataOrdine, String statoOrdine, Fornitori fornitori, Integer quantitaRichiesta, MateriaPrima materiaPrima) {
        this.id = id;
        this.dataOrdine = dataOrdine;
        this.statoOrdine = statoOrdine;
        this.fornitori = fornitori;
        this.quantitaRichiesta = quantitaRichiesta;
        this.materiaPrima = materiaPrima;
    }

    public OrdiniFornitori() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataOrdine() {
        return dataOrdine;
    }

    public void setDataOrdine(Date dataOrdine) {
        this.dataOrdine = dataOrdine;
    }

    public String getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(String statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public Fornitori getFornitori() {
        return fornitori;
    }

    public void setFornitori(Fornitori fornitori) {
        this.fornitori = fornitori;
    }

    public Integer getQuantitaRichiesta() {
        return quantitaRichiesta;
    }

    public void setQuantitaRichiesta(Integer quantitaRichiesta) {
        this.quantitaRichiesta = quantitaRichiesta;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }
}
