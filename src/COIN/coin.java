package COIN;

import java.sql.ResultSet;
import java.sql.SQLException;

import DrikingwaterMachine.DBAPP;
import DrikingwaterMachine.DrikingwaterMachineADMIN;

public class coin {
	public coin(){
		try{  
		    new DBAPP(); 
			 coinshow();

		 
	  	    	 
	  	    	
	 
	  	  DBAPP.stmt.close();  
	  	  DBAPP.conn.close(); 
	    
	    } catch ( SQLException  e ) {
	  	  System.err.println("DB Error" + e.getMessage());     
	  	  return; 
	  	  
	    }
	}
		
 public static void coinshow() throws SQLException {
		  
		  ResultSet rs;     
		  String sql;

	 

		  sql = "SELECT * from cointable"; 
  	     rs = DBAPP.stmt.executeQuery( sql ); 
  	    while (rs.next()){  

  	    	String name1 = rs.getString("coinname");
  	    	String number1= rs.getString("coinnumber");
  	        String[] add={name1,number1};//추가할 데이터
  	    	DrikingwaterMachineADMIN.model1.addRow(add);//

	}
	  }
	}


