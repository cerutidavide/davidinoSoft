package com.ceruti.davide.soldi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


/*import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;*/


public class CaricaDati {

	

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		//Inizializzazione parametri
		NumberFormat nf=NumberFormat.getInstance(Locale.US);
		String workdirname="C:\\datidavide\\tempWD\\";
		String inputdirname="c:\\DatiDavide\\Documenti\\doc - personali\\soldi\\";
		String sourceFileName="conti.wri";
		String destFileName="Movimenti-SQL.csv";		
		String inputString="";
		String outputString="";
		String puntoevirgola=";";
		String slash="/";
		String meno="-";		

		// Alloco file e buffers per leggere il file sorgente e scrivere la destinazione
		// dest ha il tracciato record buono per load data infile di MySQL
		//
		try {
			File workdir=new File(workdirname);
			File source= new File(inputdirname+sourceFileName);
			File dest= new File(workdirname+destFileName);
			if (!workdir.exists()) {
				workdir.mkdir();	
			}
			if (!source.exists()) {
				System.out.println("Sorry file o directory input inesistente!!!!");
				System.exit(2);
			}
			if (!dest.exists()){
				dest.createNewFile();
			}
			FileReader reader =new FileReader(source);		
			FileWriter writer =new FileWriter(dest);
			BufferedReader bufReader=new BufferedReader(reader);
			BufferedWriter bufWriter=new BufferedWriter(writer);
			//inputString=bufReader.readLine();
			int righe=0;
			int errori=0;
			//connetti al database
			Connection localConnection=DriverManager.getConnection("jdbc:mysql://localhost:8888/movimenti", "root", "root");			
			Statement stmt=localConnection.createStatement();
			ResultSet rslt=stmt.executeQuery("select * from movimenti.tb_movimenti");	
			
//			Trasformare il file di testo in sintassi insert?
//			INSERT INTO `movimenti`.`tb_movimenti` (`DATA_OPERAZIONE`, `DATA_VALUTA`, `CAUSALE_ESTESA`, `IMPORTO`, `CAUSALE_CODICE`) VALUES ('2005-01-27', '2005-01-27', 'vostri emolumenti', '2000', '012');

			
			
			
			while (rslt.next()){
				System.out.println("ciao");
				System.out.println(rslt.getRow());
				System.out.println("Il risultato ha "+rslt.getString("CAUSALE_ESTESA"));
			}  
			while ((inputString=bufReader.readLine())!=null){
			outputString="";
			try {
				outputString=outputString+
						inputString.split(puntoevirgola)[0].split(slash)[2]+
						meno+
						inputString.split(puntoevirgola)[0].split(slash)[1]+
						meno+
						inputString.split(puntoevirgola)[0].split(slash)[0]+
						"\t"+
						inputString.split(puntoevirgola)[1].split(slash)[2]+
						meno+
						inputString.split(puntoevirgola)[1].split(slash)[1]+
						meno+
						inputString.split(puntoevirgola)[1].split(slash)[0]+
						"\t"+
						inputString.split(puntoevirgola)[2]+
						"\t"+nf.parse(inputString.split(puntoevirgola)[3])+
						"\t"+
						inputString.split(puntoevirgola)[4];
			
				// System.out.println(outputString);
				bufWriter.write(outputString+"\n");
				
				righe++;								
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Il file contiene una riga con il tracciato record sbagliato oppure vuoto: "+"\\*"+inputString+"\\*");
				errori++;
				e.printStackTrace();
			}
//			System.out.println(outputString);
//			bufWriter.write(outputString+"\n");
			} 
			//fine ciclo normalizzazione file
			System.out.println("Ho scritto "+righe+" corrette"+" e ho trovato "+errori+" righe con errori");
			bufWriter.close();
			bufReader.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



