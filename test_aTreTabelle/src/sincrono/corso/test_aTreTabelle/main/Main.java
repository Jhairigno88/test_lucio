package sincrono.corso.test_aTreTabelle.main;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import sincrono.corso.test_aTreTabelle.model.Automobile;
import sincrono.corso.test_aTreTabelle.model.Motorino;
import sincrono.corso.test_aTreTabelle.model.Persona;

import java.io.FileOutputStream;
public class Main {

	
	
	public static void main(String[] args) throws IOException {
		
		Scanner scn=new Scanner(System.in);
		Persona p=new Persona();
		Motorino m= new Motorino();
		Automobile a=new Automobile();
		File A =new File("prova.txt");
		File M=new File("Mezzo_di_locomozione-txt");
		File C=new File("Connecting_people-txt");
	
		if( A.exists()){
			System.out.println("il File già esiste!");
		}		
		else {A.createNewFile();
		
							
//			PrintWriter scrivi= new PrintWriter(A);
//			scrivi.println("Anagrafiche");
//			scrivi.close();
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
		
		ArrayList<Persona> persone= new ArrayList<Persona>() ;
			for (int i=0;i<2;i++) {
			
			System.out.println("inserisci il nome di una persona!");
			p.setNome(scn.nextLine());
			
			System.out.println("inserisci il cognome della persona!");
			p.setCognome(scn.nextLine());
			
			System.out.println("inserisci il suo codice fiscale ");
			p.setNome(scn.nextLine());
			
			System.out.println("inserisci l'indirizzo del suo domicilio");
			p.setNome(scn.nextLine());
			
			System.out.println("questa persona ha un mezzo di locomozione?");
			String risp= scn.nextLine();
			
			if(risp.equals("si")) {
				System.out.println("che tipo di mezzo è? un motorino o una macchina?");
				String ri=scn.next();
				if (ri.equals("motorino")) {
					System.out.println("inserisci la marca del mezzo");
					m.setMarca(scn.nextLine());
					System.out.println("e la sua targa:");
					m.setTarga(scn.nextLine());
				}
				else {
					System.out.println("inserisci la marca del mezzo");
					a.setMarca(scn.nextLine());
					System.out.println("e la sua targa:");
					a.setTarga(scn.nextLine());
				}
				
			}
			
		
			
			
			
			
		}

		



	}

}


