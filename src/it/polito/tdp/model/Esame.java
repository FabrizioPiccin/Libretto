package it.polito.tdp.model;

import java.time.LocalDate;

// oggetto semplice con dati privati, costruttore, getter, setter e altri metodi di servizio
// tipo equals, toString, compareTo e altri..

public class Esame {
	
	private String codice;
    private String titoloCorso;
    private String docente;
    // sarebbe meglio definire la classe Docente
    private boolean superato;
    private int voto;
    private LocalDate dataSuperamento;
    
    /**
     * Nuovo esame non ancora superato
     * @param codice codice esame
     * @param titoloCorso nome corso
     * @param docente nome e cognome docente
     */
	public Esame(String codice, String titoloCorso, String docente) {
		super();
		this.codice = codice;
		this.titoloCorso = titoloCorso;
		this.docente = docente;
		
		this.superato=false;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the titoloCorso
	 */
	public String getTitoloCorso() {
		return titoloCorso;
	}

	/**
	 * @param titoloCorso the titoloCorso to set
	 */
	public void setTitoloCorso(String titoloCorso) {
		this.titoloCorso = titoloCorso;
	}

	/**
	 * @return the docente
	 */
	public String getDocente() {
		return docente;
	}

	/**
	 * @param docente the docente to set
	 */
	public void setDocente(String docente) {
		this.docente = docente;
	}

	/**
	 * @return the superato
	 */
	public boolean isSuperato() {
		return superato;
	}

	/**
	 * @param superato the superato to set
	 */
	private void setSuperato(boolean superato) {
		this.superato = superato;
	}

	/**
	 * Restituisce il voto solo se l'esame è stato superato
	 * altrimenti eccezione
	 * @return the voto
	 */
	public int getVoto() {
		if (this.superato){
		     return voto;
		}
		else{
			throw new IllegalStateException("Esame "+this.codice+" non ancora superato.");
		}
	}

	/**
	 * @param voto the voto to set
	 */
	private void setVoto(int voto) {
		this.voto = voto;
	}

	/**
	 * @return the dataSuperamento
	 */
	public LocalDate getDataSuperamento() {
		if (this.superato){
		     return dataSuperamento;
		}
		else{
			throw new IllegalStateException("Esame "+this.codice+" non ancora superato.");
		}
	}

	/**
	 * @param dataSuperamento the dataSuperamento to set
	 */
	private void setDataSuperamento(LocalDate dataSuperamento) {
		this.dataSuperamento = dataSuperamento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Esame [codice=" + codice + ", titoloCorso=" + titoloCorso + ", docente=" + docente + ", superato="
				+ superato + ", voto=" + voto + ", dataSuperamento=" + dataSuperamento + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Esame other = (Esame) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		return true;
	}
	
	/**
	 * Se l'esame non è superato, lo considera superato con voto e data specificati
	 * Se l'esame è già superato, genera un'eccezione
	 * @param voto
	 * @param data
	 */
	public void supera(int voto, LocalDate data){
		if (! this.superato){
			this.superato=true;
			this.voto=voto;
			this.dataSuperamento=data;
		}
		else{
			throw new IllegalStateException("Esame "+this.codice+" già superato.");
		}
	}
    
    
    
}
