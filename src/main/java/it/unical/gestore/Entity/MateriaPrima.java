package it.unical.gestore.Entity;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name="materie_prime")
public class MateriaPrima implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "quantita_disponibile", nullable = false)
    private double quantita;

    @Column(name = "livello_minimo_scorte", nullable = false)
    private double livelloMinimo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipologia", nullable = false)
    private Tipologie tipologie;


    public MateriaPrima() {
    }

    public MateriaPrima(Long id, String nome, double quantita, double livelloMinimo, Tipologie tipologie) {
        this.id = id;
        this.nome = nome;
        this.quantita = quantita;
        this.livelloMinimo = livelloMinimo;
        this.tipologie = tipologie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantita() {
        return quantita;
    }

    public void setQuantita(double quantita) {
        this.quantita = quantita;
    }

    public double getLivelloMinimo() {
        return livelloMinimo;
    }

    public void setLivelloMinimo(double livelloMinimo) {
        this.livelloMinimo = livelloMinimo;
    }

    public Tipologie getTipologie() {
        return tipologie;
    }

    public void setTipologie(Tipologie tipologie) {
        this.tipologie = tipologie;
    }
}