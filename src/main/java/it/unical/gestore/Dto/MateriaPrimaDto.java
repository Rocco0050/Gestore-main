package it.unical.gestore.Dto;

public class MateriaPrimaDto {

    private String nome;

    private double quantita;

    private double livelloMinimo;

    private Long tipologie;

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

	public Long getTipologie() {
		return tipologie;
	}

	public void setTipologie(Long tipologie) {
		this.tipologie = tipologie;
	}
}
