package sincrono.corso.test_aTreTabelle.model;

public class Persona {
	
	private int id;
	
	private String nome;
	private String cognome;
	private String codicefiscale;
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
	public String getCodicefiscale() {
		return codicefiscale;
	}
	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

}
