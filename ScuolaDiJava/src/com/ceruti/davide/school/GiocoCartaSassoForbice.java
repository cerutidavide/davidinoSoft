package com.ceruti.davide.school;

import java.util.Random;
import java.util.Scanner;

public class GiocoCartaSassoForbice {

	public GiocoCartaSassoForbice() {
		// TODO Auto-generated constructor stub
	}
	enum Giocata {
		CARTA, SASSO, FORBICE, PISTOLA;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Giocata ManoGiocatore=null;
		Giocata ManoComputer=null;
		Scanner LettoreTastiera=new Scanner(System.in);
		boolean giocoFinito=false;
		char read=' ';
		String name="Concorrente";
		Random random=new Random();
		System.out.println("Come ti chiami?" );
		name=LettoreTastiera.next();
		int vittorieGiocatore=0;
		int vittorieComputer=0;
		int pareggi=0;
		int partite=0;
		System.out.println("Ciao "+name );
		while (giocoFinito == false) {
			System.out.println("****************************************");
			System.out.println("Scegli un simbolo c,s,f, q per uscire");
			read=LettoreTastiera.next().toLowerCase().charAt(0);
			if (read=='q') {
				giocoFinito=true;
				partite=vittorieComputer+vittorieGiocatore+pareggi;
				System.out.println("Ciao, "+name);
				if (partite>0) {
					System.out.println("Hai giocato "+partite+" partite"+", ne hai vinte "+vittorieGiocatore+"("+(float)vittorieGiocatore/partite*100+"%)"+", ne hai perse "+vittorieComputer+"("+(float)vittorieComputer/partite*100+"%)"+" e ne hai pareggiate "+pareggi+"("+(float)pareggi/partite*100+"%)");
				} else
				{
					System.out.println("Sarà per la prossima volta");
				}
				
				break;
			}
			else 
			{
				switch (random.nextInt(3)) {
				case 0 :{
				ManoComputer=Giocata.CARTA;
				break;
				}
				case 1 :{
				ManoComputer=Giocata.FORBICE;
				break;
				}
				case 2 :{
				ManoComputer=Giocata.SASSO;
				break;
				}
				}
				if (read =='c') {
					ManoGiocatore=Giocata.CARTA;
				} 
				else 
					if (read =='s') {
						ManoGiocatore=Giocata.SASSO;
					} 
					else
						if (read =='f') {
							ManoGiocatore=Giocata.FORBICE;
						} 
						else {
							if (read =='p') {
								ManoGiocatore=Giocata.PISTOLA;
								ManoComputer=Giocata.CARTA;
							}
							else {
							System.out.println("Scelta non valida!!!");
							ManoGiocatore=null;
							ManoComputer=null;
							}
						}
			}

			
			if (ManoGiocatore!=null) {
				
				if (read != 'p') {
					System.out.println("Hai scelto: " + ManoGiocatore);
					System.out.println("Il Computer ha scelto: " + ManoComputer);
				}
				if (ManoGiocatore == ManoComputer) {
					System.out.println("Pareggio");
					pareggi++;
				} else {
					if ((ManoGiocatore == Giocata.CARTA)
							&& (ManoComputer == Giocata.FORBICE)) {
						System.out.println("Vince Computer!");
						vittorieComputer++;
					}
					if ((ManoGiocatore == Giocata.CARTA)
							&& (ManoComputer == Giocata.SASSO)) {
						System.out.println("Vince " + name + "!");
						vittorieGiocatore++;
					}
					if ((ManoGiocatore == Giocata.SASSO)
							&& (ManoComputer == Giocata.FORBICE)) {
						System.out.println("Vince " + name + "!");
						vittorieGiocatore++;
					}
					if ((ManoGiocatore == Giocata.SASSO)
							&& (ManoComputer == Giocata.CARTA)) {
						System.out.println("Vince Computer!");
						vittorieComputer++;
					}
					if ((ManoGiocatore == Giocata.FORBICE)
							&& (ManoComputer == Giocata.CARTA)) {
						System.out.println("Vince " + name + "!");
						vittorieGiocatore++;
					}
					if ((ManoGiocatore == Giocata.FORBICE)
							&& (ManoComputer == Giocata.SASSO)) {
						System.out.println("Vince Computer!");
						vittorieComputer++;
					}
					if ((ManoGiocatore == Giocata.PISTOLA)) {
						System.out.println("Vince " + name + "!");
						vittorieGiocatore++;
					}
				}
			}
		}
		LettoreTastiera.close();
		//input per ManoGiocatore
		
		
		//random per Mano Computer
		
		
//		while (true){
//			System.out.println(random.nextInt(3));
//		}
	
		

		
		
		
	}

}
