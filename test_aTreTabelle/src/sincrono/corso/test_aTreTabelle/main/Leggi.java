package sincrono.corso.test_aTreTabelle.main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leggi {

	public static void main(String[] args) throws IOException {
	
	FileReader file= new FileReader("Anagrafica-txt");
    BufferedReader lettore=new BufferedReader(file);
    String riga=lettore.readLine();
    while(riga != null) {
    	System.out.println(riga);
    	riga=lettore.readLine();
    }
	
	file.close();
	}

}
