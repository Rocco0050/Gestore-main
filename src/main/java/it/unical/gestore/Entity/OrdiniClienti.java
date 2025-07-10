package it.unical.gestore.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import it.unical.gestore.Enum.StatoOrdine;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ordini_clienti")
public class OrdiniClienti implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "data_ordine")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dataOrdine;

    @Column(name = "stato_ordine")
    private String statoOrdine;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Clienti idCliente;

    @Column(name = "quantita_richiesta")
    private Integer quantitaRichiesta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_materia_prima", nullable = false)
    private MateriaPrima materiaPrima;

    public OrdiniClienti(Long id, Date dataOrdine, String statoOrdine, Clienti idCliente, Integer quantitaRichiesta, MateriaPrima materiaPrima) {
        this.id = id;
        this.dataOrdine = dataOrdine;
        this.statoOrdine = statoOrdine;
        this.idCliente = idCliente;
        this.quantitaRichiesta = quantitaRichiesta;
        this.materiaPrima = materiaPrima;
    }

    public OrdiniClienti() {
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

    public Clienti getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Clienti idCliente) {
        this.idCliente = idCliente;
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
