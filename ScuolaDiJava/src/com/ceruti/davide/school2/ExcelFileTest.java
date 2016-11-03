package com.ceruti.davide.school2;

import java.sql.*;

public class ExcelFileTest {

	public ExcelFileTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn1=DriverManager.getConnection("jdbc:odbc:MovimentiConto");
			System.out.println("Connesso al database");
			Statement stmt1=conn1.createStatement();
			String sqlString=new String("select * from [Movimenti$] where [Movimenti$].DATA1 like '%2006'");
			ResultSet rslt1=stmt1.executeQuery(sqlString);
			int count=0;
			while (rslt1.next()){
				System.out.println(rslt1.getString("DATA1")+"||");
				count++;
				//rslt1.previous();
				//System.out.print(rslt1.getString("TITOLO"));
				//System.out.println(rslt1.getString("AUTORE"));
					
			}
			System.out.println("Numero di record estratti: "+count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
