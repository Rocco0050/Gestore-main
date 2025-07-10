package it.unical.gestore.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="clienti")
public class Clienti {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable=false)
    private Long id;

    @Column(name="nome",nullable = false)
    private String nome;

    @Column(name="cognome",nullable = false)
    private String cognome;

    @Column(name="email",nullable = false)
    private String email;

    @Column(name="numero_telefono",nullable = false)
    private String numeroTelefono;

    @Column(name="indirizzo_spedizione",nullable = false)
    private String indirizzoSpedizione;

    public Clienti(){

    }

    public Clienti(Long id, String nome, String cognome, String email, String numeroTelefono, String indirizzoSpedizione) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
        this.indirizzoSpedizione = indirizzoSpedizione;
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

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getIndirizzoSpedizione() {
        return indirizzoSpedizione;
    }

    public void setIndirizzoSpedizione(String indirizzoSpedizione) {
        this.indirizzoSpedizione = indirizzoSpedizione;
    }
}
