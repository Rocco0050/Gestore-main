package it.unical.gestore.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="fornitori")
public class Fornitori implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable=false)
    private Long id;

    @Column(name="nome",nullable=false)
    private String nome;

    @Column(name="cognome",nullable=false)
    private String cognome;

    @Column(name="email",nullable = false)
    private String email;

    @Column(name = "ragione_sociale",nullable=false)
    private String ragioneSociale;

    @Column(name = "partita_iva", nullable=false)
    private String partitaIVA;



    public Fornitori(Long id, String nome, String cognome, String email, String ragionesociale, String partitaIVA) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.ragioneSociale = ragionesociale;
        this.partitaIVA = partitaIVA;

    }

    public Fornitori() {
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getPartitaIVA() {
        return partitaIVA;
    }

    public void setPartitaIVA(String partitaIVA) {
        this.partitaIVA = partitaIVA;
    }
}
