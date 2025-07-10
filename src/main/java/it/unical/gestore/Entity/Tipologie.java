package it.unical.gestore.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipologie")
public class Tipologie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "descrizione", nullable = false)
    private String descrizione;

    public Tipologie() {
    }

    public Tipologie(Long id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
