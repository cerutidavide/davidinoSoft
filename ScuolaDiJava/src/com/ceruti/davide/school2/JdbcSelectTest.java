package com.ceruti.davide.school2;
import java.sql.*;
import java.util.Properties;
public class JdbcSelectTest {

	public JdbcSelectTest() {
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:8888/ebookshop", "root", "root");			
			//System.out.println("Connessione è della classe: " + conn1.getClass().getName());
			//conn1.setCatalog("test");
			
			
			System.out.println("Lista Database esistenti: " + conn1.getCatalog());
			
			DatabaseMetaData dbmd=conn1.getMetaData();
			ResultSet rslt=dbmd.getTables(conn1.getCatalog(), "", "book%%", null );
			while (rslt.next()) {				
				System.out.println(rslt.getString("TABLE_NAME"));			
			}	
			ResultSet rslt2=dbmd.getColumns(conn1.getCatalog(), null, "books", null);
			while (rslt2.next()) {				
				System.out.print(rslt2.getString("COLUMN_NAME")+" "+rslt2.getString("TYPE_NAME"));
				System.out.println();
			}
			
			
			
			
			
	
			System.out.println(dbmd.getDatabaseProductVersion());
			//ResultSet rslt2=dbmd.getTables(arg0, arg1, arg2, arg3);
			Properties propConn1=conn1.getClientInfo();
			System.out.println(propConn1);
			System.out.println("propConn1 è della classe: " + propConn1.getClass().getName());
//			Statement stmt = conn1.createStatement();
//			ResultSet rslt2=stmt.executeQuery("select * from ebookshop.books");
			System.out.println("|title|author|");
//			while (rslt2.next()) {
//				
//				System.out.print("|"+rslt2.getString("title")+"|");
//				System.out.println(rslt2.getString("author")+"|");
//				
//			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
