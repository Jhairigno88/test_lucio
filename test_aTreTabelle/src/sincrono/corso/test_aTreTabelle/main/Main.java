package sincrono.corso.test_aTreTabelle.main;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import sincrono.corso.test_aTreTabelle.model.Automobile;
import sincrono.corso.test_aTreTabelle.model.Motorino;
import sincrono.corso.test_aTreTabelle.model.Persona;


public class Main {

	
	
	public static void main(String[] args) throws IOException {
		
		Scanner scn=new Scanner(System.in);
		Persona p=new Persona();
		Motorino m= new Motorino();
		Automobile a=new Automobile();
		File A=new File("prova.txt");
		File M=new File("Mezzo_di_locomozione.txt");
		File C=new File("Connecting_people.txt");
	
		if( A.exists()){
			System.out.println("il File già esiste!");
		}		
		else {A.createNewFile();
			System.out.println("creato!");			 
		}
		
		if( M.exists()){
			System.out.println("il File già esiste!");
		}		
		else {M.createNewFile();
			System.out.println("creato!");
		}
		
		if( C.exists()){
			System.out.println("il File già esiste!");
		}		
		else {C.createNewFile();
			System.out.println("creato!");
		}
		/*
		System.out.println("Ciao, per prima cosa scrivi ");
		System.out.println("il numero di persone che vuoi inserire");
		int x=scn.nextInt();
		*/
		
		ArrayList<Persona> persone= new ArrayList<Persona>() ;
			
			for (int i=0;i<2;i++) {
			p.setId(i+1);
			System.out.println("inserisci il nome di una persona!");
			p.setNome(scn.nextLine());
			
			System.out.println("inserisci il cognome della persona!");
			p.setCognome(scn.nextLine());
			
			System.out.println("inserisci il suo codice fiscale ");
			p.setCodicefiscale(scn.nextLine());
			
			System.out.println("inserisci l'indirizzo del suo domicilio");
			p.setIndirizzo(scn.nextLine());
			persone.add(p);
			
			PrintWriter scrivi= new PrintWriter(A);
			scrivi.println("Elenco Persone");
			scrivi.println(p.getId() + "Nome: " + p.GetNome() + " Cognome: " + p.getCognome() + 
							" Codice fiscale: " + p.getCodicefiscale() + 
							" indirizzo: " + p.getIndirizzo());
			scrivi.close();
			
			
			System.out.println("questa persona ha un mezzo di locomozione?");
			String risp= scn.nextLine();
			
			if(risp.equals("si")) {
				System.out.println("che tipo di mezzo è? un motorino o una macchina?");
				String ri=scn.nextLine();
				if (ri.equals("motorino")) {
					System.out.println("inserisci il modello del mezzo");
					m.setModello(scn.nextLine());
					System.out.println("e la sua targa:");
					m.setTarga(scn.nextLine());
					
					PrintWriter scrivia = new PrintWriter(M);
					scrivia.println("mezzi di trasporto:");
					scrivia.println("Modello: "+ a.getModello()+" Targa:"+a.getTarga());
					scrivia.close();
				}
				else {
					System.out.println("inserisci il modello del mezzo");
					a.setModello(scn.nextLine());
					System.out.println("e la sua targa:");
					a.setTarga(scn.nextLine());
					
					PrintWriter scrivia = new PrintWriter(M);
					scrivia.println("mezzi di trasporto:");
					scrivia.println("Modello: "+ a.getModello()+" Targa:"+a.getTarga());
					scrivia.close();
				}
				
			}
			
			
		
			
			
		
			
			
			
		}

		

			scn.close();

	}

}


