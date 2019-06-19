package sincrono.corso.test_aTreTabelle.model;

public class Persona {
	
	private int id;
	
	private String nome;
	private String cognome;
	private int codicefiscale;
	private String indirizzo;
	
	public Persona() {};
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String GetNome() {
		return nome;
		
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getCodicefiscale() {
		return codicefiscale;
	}
	public void setCodicefiscale(int codicefiscale) {
		this.codicefiscale = codicefiscale;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

}
